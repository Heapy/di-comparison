fun main() {
    (1..101).forEach {
        println("""
            open val s$it: MutableBean<Service$it> by bean {
                DefaultService$it(s${it + 1}.value)
            }
        """.trimIndent())
    }
}
