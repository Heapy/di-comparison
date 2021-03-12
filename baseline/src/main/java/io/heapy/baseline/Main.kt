package io.heapy.baseline

import org.objectstyle.di.service.ServiceImpl
import org.objectstyle.di.service.SubServiceImpl

fun main() {
    val s = ServiceImpl(SubServiceImpl())

    println(s.doIt())
}
