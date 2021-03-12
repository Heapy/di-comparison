package org.objectstyle.koin

import org.koin.dsl.koinApplication
import org.koin.dsl.module
import org.koin.experimental.builder.singleBy
import org.objectstyle.di.service.Service
import org.objectstyle.di.service.ServiceImpl
import org.objectstyle.di.service.SubService
import org.objectstyle.di.service.SubServiceImpl

fun main() {
    val s = koinApplication {
        modules(module {
            singleBy<Service, ServiceImpl>()
            singleBy<SubService, SubServiceImpl>()
        })
    }.koin.get<Service>()

    println(s.doIt())
}
