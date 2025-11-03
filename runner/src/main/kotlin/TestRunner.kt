import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import tools.jackson.module.kotlin.jacksonObjectMapper
import tools.jackson.module.kotlin.readValue
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.Locale
import kotlin.math.max
import kotlin.time.Duration.Companion.seconds

val projects = listOf(
    "springboot-index",
    "baseline",
    "bootique",
    "cayennedi",
    "dagger",
    "dimension",
    "guice",
    "kodein",
    "koin",
    "koin-reflect",
    "komok-to-be-injected",
    "kotlin-lazy",
    "owb",
    "spring",
    "spring-scan",
    "spring-xml",
    "springboot",
    "spring-index",

//  TODO:
//    "helidon",
//    "micronaut",
//    "quarkus",
//    "spring-fu",
//    "spring-scan-large",
)

data class TestResult(
    val project: String,
    val fileSize: String, // MB
    val loc: Int,
    val wallTimeMs: Double, // average wall-clock time per iteration
    val userTimeMs: Double, // average user CPU time per iteration
    val systemTimeMs: Double, // average system CPU time per iteration
    val maxRssMb: Double, // peak resident set size across iterations
    val allocatedMb: String, // total MB allocated (JFR)
    val allocationCount: Long // total number of allocations (JFR)
)

data class RunMetrics(
    val wallTimeMs: Double,
    val userTimeMs: Double,
    val systemTimeMs: Double,
    val maxRssKb: Long
)

private val om = jacksonObjectMapper()
private val clocBinary = System.getenv("CLOC")?.takeIf { it.isNotBlank() } ?: "cloc"
private val gtimeBinary = System.getenv("GTIME")?.takeIf { it.isNotBlank() } ?: "gtime"
private const val GTIME_FORMAT = "%e %U %S %M"

fun main() {
    val jvm = listOf("jvm").map(::calculate).sortedBy { it.wallTimeMs }.toTable()
    val table = projects.map(::calculate).sortedBy { it.wallTimeMs }.toTable()
    val tableDeep = projects.map { "$it-deep" }.map(::calculate).sortedBy { it.wallTimeMs }.toTable()

    println(jvm)
    println(table)
    println(tableDeep)
}

fun calculate(prj: String): TestResult {
    val iterations = 100

    val artifactPath = Paths.get("$prj/build/distributions/$prj.tar")
    val size = Files.size(artifactPath)

    val clocResult = runCloc(prj)
    val command = "$prj/build/install/$prj/bin/$prj"

    val allocationStats = recordAllocationStats(command, prj)

    var wallTotal = 0.0
    var userTotal = 0.0
    var systemTotal = 0.0
    var peakRssKb = 0L

    (1..iterations).forEach { iter ->
        println("$prj-$iter")
        Thread.sleep(2.seconds.inWholeMilliseconds)
        val metrics = runWithGTime(command)
        wallTotal += metrics.wallTimeMs
        userTotal += metrics.userTimeMs
        systemTotal += metrics.systemTimeMs
        peakRssKb = max(peakRssKb, metrics.maxRssKb)
    }

    val divisor = iterations.toDouble()

    return TestResult(
        project = prj,
        fileSize = "%1$,.2f".format(Locale.US, size.toDouble() / 1024 / 1024),
        loc = clocResult.sum.code,
        wallTimeMs = wallTotal / divisor,
        userTimeMs = userTotal / divisor,
        systemTimeMs = systemTotal / divisor,
        maxRssMb = peakRssKb.toDouble() / 1024,
        allocatedMb = "%1$,.2f".format(Locale.US, allocationStats.totalBytes.toDouble() / 1024 / 1024),
        allocationCount = allocationStats.count
    )
}

private fun runCloc(prj: String): ClocResult {
    val process = ProcessBuilder()
        .command(clocBinary, "--json", "$prj/src")
        .start()

    val stdout = process.inputStream.bufferedReader().use { it.readText() }
    val stderr = process.errorStream.bufferedReader().use { it.readText() }
    val exitCode = process.waitFor()

    if (exitCode != 0) {
        error("`$clocBinary` failed for $prj (exit $exitCode).\n$stderr")
    }

    return om.readValue<ClocResult>(stdout)
}

private fun recordAllocationStats(command: String, project: String): AllocationStats {
    val jfrFile = Files.createTempFile("$project-", ".jfr")
    try {
        println("$project-jfr (recording allocations)")
        val jfrOpts = buildString {
            append("-Xms32m -Xmx32m ")
            append("-XX:StartFlightRecording=")
            append("filename=${jfrFile},")
            append("settings=profile,")
            append("duration=60s,")
            append("jdk.ObjectAllocationInNewTLAB#enabled=true,")
            append("jdk.ObjectAllocationOutsideTLAB#enabled=true ")
            append("-XX:FlightRecorderOptions=stackdepth=64")
        }

        val process = ProcessBuilder()
            .also { proc ->
                proc.environment()["JAVA_OPTS"] = jfrOpts
            }
            .command(command)
            .redirectOutput(ProcessBuilder.Redirect.INHERIT)
            .redirectError(ProcessBuilder.Redirect.INHERIT)
            .start()

        val exitCode = process.waitFor()
        require(exitCode == 0) { "JFR recording failed for $project (exit code $exitCode)" }

        return parseJfrAllocations(jfrFile)
    } finally {
        Files.deleteIfExists(jfrFile)
    }
}

private fun runWithGTime(command: String): RunMetrics {
    val commandName = command.substringAfterLast('/').ifBlank { "run" }
    val tempFile = Files.createTempFile("gtime-$commandName-", ".log")
    try {
        val processBuilder = ProcessBuilder()
            .command(gtimeBinary, "-o", tempFile.toString(), "-f", GTIME_FORMAT, command)
            .redirectOutput(ProcessBuilder.Redirect.INHERIT)
            .redirectError(ProcessBuilder.Redirect.INHERIT)

        processBuilder.environment()["JAVA_OPTS"] = "-Xms16m -Xmx16m"

        val process = try {
            processBuilder.start()
        } catch (ex: IOException) {
            throw IllegalStateException(
                "Failed to start $command via $gtimeBinary. Ensure the binary exists and is on PATH.",
                ex
            )
        }

        val exitCode = process.waitFor()
        require(exitCode == 0) { "exit code $exitCode for $command" }

        val metricsLines = Files.readAllLines(tempFile).filter { it.isNotBlank() }
        require(metricsLines.isNotEmpty()) { "gtime produced no output for $command" }

        val tokens = metricsLines.last().split(Regex("\\s+"))
        require(tokens.size >= 4) { "Unexpected gtime output: '${metricsLines.last()}'" }

        try {
            val wallTimeMs = tokens[0].toDouble() * 1_000
            val userTimeMs = tokens[1].toDouble() * 1_000
            val systemTimeMs = tokens[2].toDouble() * 1_000
            val maxRssKb = tokens[3].toLong()

            return RunMetrics(
                wallTimeMs = wallTimeMs,
                userTimeMs = userTimeMs,
                systemTimeMs = systemTimeMs,
                maxRssKb = maxRssKb
            )
        } catch (ex: NumberFormatException) {
            throw IllegalStateException("Failed to parse gtime output: '${metricsLines.last()}'", ex)
        }
    } finally {
        Files.deleteIfExists(tempFile)
    }
}

data class AllocationStats(
    val totalBytes: Long,
    val count: Long
)

private fun parseJfrAllocations(jfrFile: Path): AllocationStats {
    val jsonOutput = Files.createTempFile("jfr-", ".json")
    try {
        val process = ProcessBuilder()
            .command(
                "jfr",
                "print",
                "--json",
                "--events", "jdk.ObjectAllocationInNewTLAB,jdk.ObjectAllocationOutsideTLAB",
                jfrFile.toString()
            )
            .redirectOutput(jsonOutput.toFile())
            .start()

        val exitCode = process.waitFor()
        require(exitCode == 0) { "jfr print failed with exit code $exitCode" }

        val jsonContent = Files.readString(jsonOutput)

        var totalBytes = 0L
        var count = 0L

        try {
            val root = om.readTree(jsonContent)
            val recording = root.get("recording")
            val events = recording?.get("events")

            events?.forEach { event ->
                val type = event.get("type")?.asString()
                if (type == "jdk.ObjectAllocationInNewTLAB" || type == "jdk.ObjectAllocationOutsideTLAB") {
                    val allocationSize = event.get("values")?.get("allocationSize")?.asLong() ?: 0L
                    totalBytes += allocationSize
                    count++
                }
            }
        } catch (e: Exception) {
            println("Warning: Failed to parse JFR JSON: ${e.message}")
        }

        return AllocationStats(totalBytes, count)
    } finally {
        Files.deleteIfExists(jsonOutput)
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class ClocResult(
    @param:JsonProperty("SUM")
    val sum: ClocSumResult,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ClocSumResult(
    val code: Int,
)

fun List<TestResult>.toTable(): String {
    val results = this
    return buildString {
        appendLine("|DI|Jar w/Deps Size, Mb|:arrow_down: Wall, ms|User, ms|Sys, ms|Max RSS, Mb|Allocated, Mb|Alloc Count|LoC|")
        appendLine("|----|----|----|----|----|----|----|----|----|")
        results.forEach { result ->
            appendLine(
                "|${result.project}|${result.fileSize}|" +
                    "%1$,.2f".format(Locale.US, result.wallTimeMs) + "|" +
                    "%1$,.2f".format(Locale.US, result.userTimeMs) + "|" +
                    "%1$,.2f".format(Locale.US, result.systemTimeMs) + "|" +
                    "%1$,.2f".format(Locale.US, result.maxRssMb) + "|" +
                    result.allocatedMb + "|" +
                    String.format(Locale.US, "%,d", result.allocationCount) + "|" +
                    result.loc + "|"
            )
        }
    }
}
