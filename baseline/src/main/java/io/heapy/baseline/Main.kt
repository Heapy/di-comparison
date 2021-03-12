package io.heapy.baseline

import io.heapy.di.service.ServiceImpl
import io.heapy.di.service.SubServiceImpl

fun main() {
    val s = ServiceImpl(SubServiceImpl())

    println(s.doIt())
}
