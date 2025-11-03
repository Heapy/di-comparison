package io.heapy.klazy

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
