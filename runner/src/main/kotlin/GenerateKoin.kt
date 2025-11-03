fun main() {
    (1..101).forEach {
        println("""
            single<Service$it> { DefaultService$it(get()) }
        """.trimIndent())
    }

    (1..101).forEach {
        println("""
            singleOf(::DefaultService$it) bind Service$it::class
        """.trimIndent())
    }
}
