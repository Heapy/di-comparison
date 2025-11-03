package io.heapy.komok

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
