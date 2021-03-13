package io.heapy.klazy

import io.heapy.di.service.Service
import io.heapy.di.service.ServiceImpl
import io.heapy.di.service.SubService
import io.heapy.di.service.SubServiceImpl

fun main() {
    println(Main().service.doIt())
}

open class Main {
    open val service: Service by lazy {
        ServiceImpl(subService)
    }

    open val subService: SubService by lazy {
        SubServiceImpl()
    }
}
