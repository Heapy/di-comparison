package io.heapy.komodo

import io.heapy.komodo.di.createContextAndGet
import io.heapy.komodo.di.module
import io.heapy.komodo.di.provide
import io.heapy.komodo.di.type
import io.heapy.di.service.Service
import io.heapy.di.service.ServiceImpl
import io.heapy.di.service.SubService
import io.heapy.di.service.SubServiceImpl

suspend fun main() {
    val s = createContextAndGet(type<Service>(), mainModule)
    println(s.doIt())
}

val mainModule by module {
    provide<Service>(::ServiceImpl)
    provide<SubService>(::SubServiceImpl)
}

