import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import tools.jackson.module.kotlin.jacksonObjectMapper
import tools.jackson.module.kotlin.readValue
import java.nio.file.Files
import java.nio.file.Paths
import java.time.Duration
import java.util.Locale
import kotlin.system.measureNanoTime

val projects = listOf(
    "springboot-index",
    "baseline",
    "bootique",
    "cayennedi",
    "dagger",
    "guice",
    "kodein",
    "koin",
    "koin-reflect",
    "komok-to-be-injected",
    "kotlin-lazy",
    // "owb", TODO: Update to support Java 25
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
    val execTime: Long // ms
)

val om = jacksonObjectMapper()

fun main() {
    val jvm = listOf("jvm").map(::calculate).sortedBy { it.execTime }.toTable()
    val table = projects.map(::calculate).sortedBy { it.execTime }.toTable()
    val tableDeep = projects.map { "$it-deep" }.map(::calculate).sortedBy { it.execTime }.toTable()

    println(jvm)
    println(table)
    println(tableDeep)
}

fun calculate(prj: String): TestResult {
    val iterations = 1

    val artifactPath = Paths.get("$prj/build/distributions/$prj.tar")
    val size = Files.size(artifactPath)

    // which cloc
    val clocCommand = "/opt/homebrew/bin/cloc"
    val clocProc = ProcessBuilder()
        .command(clocCommand, "--json", "$prj/src")
        .start()
    val clocText = clocProc.inputStream.reader().readText()
    val clocResult = om.readValue<ClocResult>(clocText)

    val nanos = measureNanoTime {
        (1..iterations).forEach { iter ->
            println("$prj-$iter")
            val command = "$prj/build/install/$prj/bin/$prj"
            val result = ProcessBuilder()
                .also { proc ->
                    proc.environment()["JAVA_OPTS"] = "-Xms32m -Xmx32m"
                }
                .inheritIO()
                .command(command)
                .start()
                .waitFor()

            require(result == 0) { "exit code $result for $prj ($command)" }
        }
    }

    return TestResult(
        project = prj,
        fileSize = "%1$,.2f".format(Locale.US, size.toDouble() / 1024 / 1024),
        loc = clocResult.sum.code,
        execTime = Duration.ofNanos(nanos / iterations).toMillis()
    )
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
        appendLine("|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|")
        appendLine("|----|----|----|----|")
        results.forEach { result ->
            appendLine("|${result.project}|${result.fileSize}|${result.execTime}|${result.loc}|")
        }
    }
}
