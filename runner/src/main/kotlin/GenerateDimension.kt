fun main() {
    (1..101).forEach {
        println("""
        .bind(Service$it::class.java, DefaultService$it::class.java)
        """.trimIndent())
    }

    (1..101).forEach {
        println("""
        interface Service$it {
            fun name(): String
        }
        @Singleton
        class DefaultService$it @Inject constructor(private val service: Service${it + 1}) : Service$it {
            override fun name() = service.name()
        }

        """.trimIndent())
    }
}
