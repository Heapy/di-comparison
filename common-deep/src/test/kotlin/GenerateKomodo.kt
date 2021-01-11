fun main() {
    (1..101).forEach {
        println("""
            provide<Service$it>(::DefaultService$it)
        """.trimIndent())
    }
}
