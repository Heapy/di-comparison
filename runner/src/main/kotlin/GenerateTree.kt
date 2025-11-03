fun main() {
    (1..100).forEach {
        println("""
            interface Service$it {
                fun name(): String
            }
            class DefaultService$it(private val service: Service${it+1}) : Service$it {
                override fun name() = service.name()
            }
            
        """.trimIndent())
    }
}
