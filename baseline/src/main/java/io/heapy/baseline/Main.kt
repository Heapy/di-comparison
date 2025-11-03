package io.heapy.baseline

fun main() {
    val s = ServiceImpl(SubServiceImpl())

    println(s.doIt())
}
