package org.objectstyle.komodo

import io.heapy.komodo.di.createContextAndGet
import io.heapy.komodo.di.module
import io.heapy.komodo.di.provide
import io.heapy.komodo.di.type
import org.objectstyle.di.service.Service
import org.objectstyle.di.service.ServiceImpl
import org.objectstyle.di.service.SubService
import org.objectstyle.di.service.SubServiceImpl

suspend fun main() {
    val s = createContextAndGet(type<Service>(), mainModule)
    println(s.doIt())
}

val mainModule by module {
    provide<Service>(::ServiceImpl)
    provide<SubService>(::SubServiceImpl)
}

