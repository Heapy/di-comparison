package io.heapy.koin

import org.koin.dsl.koinApplication
import org.koin.dsl.module
import org.koin.experimental.builder.singleBy
import io.heapy.di.service.Service
import io.heapy.di.service.ServiceImpl
import io.heapy.di.service.SubService
import io.heapy.di.service.SubServiceImpl

fun main() {
    val s = koinApplication {
        modules(module {
            singleBy<Service, ServiceImpl>()
            singleBy<SubService, SubServiceImpl>()
        })
    }.koin.get<Service>()

    println(s.doIt())
}
