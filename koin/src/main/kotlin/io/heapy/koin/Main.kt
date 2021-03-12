package io.heapy.koin

import org.koin.dsl.koinApplication
import org.koin.dsl.module
import io.heapy.di.service.Service
import io.heapy.di.service.ServiceImpl
import io.heapy.di.service.SubService
import io.heapy.di.service.SubServiceImpl

fun main() {
    val s = koinApplication {
        modules(module {
            single<Service> { ServiceImpl(get()) }
            single<SubService> { SubServiceImpl() }
        })
    }.koin.get<Service>()

    println(s.doIt())
}
