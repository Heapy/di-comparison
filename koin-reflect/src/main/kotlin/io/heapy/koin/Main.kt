package io.heapy.koin

import org.koin.dsl.koinApplication
import org.koin.dsl.module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind

fun main() {
    val s = koinApplication {
        modules(module {
            singleOf(::ServiceImpl) bind Service::class
            singleOf(::SubServiceImpl) bind SubService::class
        })
    }.koin.get<Service>()

    println(s.doIt())
}
