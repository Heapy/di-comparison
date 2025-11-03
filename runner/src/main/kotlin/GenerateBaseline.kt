fun main() {
    println("val s101 = DefaultService101()")
    (100 downTo 1).forEach {
        println("""
            val s$it = DefaultService$it(s${it + 1})
        """.trimIndent())
    }
}
