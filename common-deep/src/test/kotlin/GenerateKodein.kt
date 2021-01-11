fun main() {
    (1..101).forEach {
        println("""
            bind<Service$it>() with singleton { DefaultService$it(instance()) }
        """.trimIndent())
    }
}
