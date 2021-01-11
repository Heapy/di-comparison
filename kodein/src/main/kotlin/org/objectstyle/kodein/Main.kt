package org.objectstyle.kodein

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.direct
import org.kodein.di.instance
import org.kodein.di.singleton
import org.objectstyle.di.service.Service
import org.objectstyle.di.service.ServiceImpl
import org.objectstyle.di.service.SubService
import org.objectstyle.di.service.SubServiceImpl

fun main() {
    val s = DI {
        bind<Service>() with singleton { ServiceImpl(instance()) }
        bind<SubService>() with singleton { SubServiceImpl() }
    }.direct.instance<Service>()

    println(s.doIt())
}
