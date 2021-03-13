import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.nio.file.Files
import java.nio.file.Paths
import java.time.Duration
import java.util.Locale
import kotlin.system.measureNanoTime

val projects = listOf(
    "baseline",
    "bootique",
    "cayennedi",
    "dagger",
    "guice",
    "kodein",
    "koin",
    "koin-reflect",
    "komodo",
    "kotlin-lazy",
    "owb",
    "spring",
    "spring-xml",
    "springboot",
//  TODO:
//    "helidon",
//    "micronaut",
//    "quarkus",
//    "spring-fu",
//    "spring-index",
//    "spring-scan",
//    "spring-scan-large",
//    "springboot-index",
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
    val iterations = 50

    val artifactPath = Paths.get("$prj/build/distributions/$prj.tar")
    val size = Files.size(artifactPath)

    val clocProc = ProcessBuilder()
        .command("/usr/local/bin/cloc", "--json", "/Users/mbp/dev/pet/di-comparison/$prj/src")
        .start()
    val clocText = clocProc.inputStream.reader().readText()
    val clocResult = om.readValue<ClocResult>(clocText)

    val nanos = measureNanoTime {
        (1..iterations).forEach { iter ->
            println("$prj-$iter")
            ProcessBuilder()
                .command("/Users/mbp/dev/pet/di-comparison/$prj/build/install/$prj/bin/$prj")
                .start()
                .waitFor()
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
    @JsonProperty("SUM")
    val sum: ClocSumResult
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ClocSumResult(
    val code: Int
)

fun List<TestResult>.toTable(): String {
    return buildString {
        appendLine("|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|")
        appendLine("|----|----|----|----|")
        this@toTable.forEach { result ->
            appendLine("|${result.project}|${result.fileSize}|${result.execTime}|${result.loc}|")
        }
    }
}
