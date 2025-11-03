package io.heapy.spring

import org.springframework.context.support.GenericXmlApplicationContext

fun main() {
    val context = GenericXmlApplicationContext("classpath:beans.xml")
    println(context.getBean(Service::class.java).doIt())
}
