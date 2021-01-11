fun main() {
    (1..101).forEach {
        println("""
            single<Service$it> { DefaultService$it(get()) }
        """.trimIndent())
    }
}
