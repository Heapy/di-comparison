package org.objectstyle.koin

import org.koin.dsl.koinApplication
import org.koin.dsl.module
import org.objectstyle.di.service.Service
import org.objectstyle.di.service.ServiceImpl
import org.objectstyle.di.service.SubService
import org.objectstyle.di.service.SubServiceImpl

fun main() {
    val s = koinApplication {
        modules(module {
            single<Service> { ServiceImpl(get()) }
            single<SubService> { SubServiceImpl() }
        })
    }.koin.get<Service>()

    println(s.doIt())
}
