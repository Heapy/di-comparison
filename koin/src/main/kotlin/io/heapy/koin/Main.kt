package io.heapy.koin

import org.koin.dsl.koinApplication
import org.koin.dsl.module

fun main() {
    val s = koinApplication {
        modules(module {
            single<Service> { ServiceImpl(get()) }
            single<SubService> { SubServiceImpl() }
        })
    }.koin.get<Service>()

    println(s.doIt())
}
