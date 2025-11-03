package io.heapy.komok_to_be_injected

import io.heapy.di.service.Service
import io.heapy.di.service.ServiceImpl
import io.heapy.di.service.SubService
import io.heapy.di.service.SubServiceImpl
import io.heapy.komok.tech.di.delegate.MutableBean
import io.heapy.komok.tech.di.delegate.bean

fun main() {
    println(MainModule().service.value.doIt())
}

class MainModule {
    val service: MutableBean<Service> by bean {
        ServiceImpl(subService.value)
    }

    val subService: MutableBean<SubService> by bean {
        SubServiceImpl()
    }
}
