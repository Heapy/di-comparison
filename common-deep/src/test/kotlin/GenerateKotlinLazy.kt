fun main() {
    (1..101).forEach {
        println("""
            open val s$it: Service$it by lazy {
                DefaultService$it(s${it + 1})
            }
        """.trimIndent())
    }
}
