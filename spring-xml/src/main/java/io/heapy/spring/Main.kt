package io.heapy.spring

import io.heapy.di.service.Service
import org.springframework.context.support.GenericXmlApplicationContext

fun main() {
    val context = GenericXmlApplicationContext("classpath:beans.xml")
    println(context.getBean(Service::class.java).doIt())
}
