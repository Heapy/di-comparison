package io.heapy.dimension

import ru.dimension.di.DimensionDI
import ru.dimension.di.ServiceLocator
import kotlin.jvm.java

fun main() {
    DimensionDI.builder()
        .scanPackages("io.heapy.dimension")
        .bind(Service::class.java, ServiceImpl::class.java)
        .bind(SubService::class.java, SubServiceImpl::class.java)
        .buildAndInit()

    val app = ServiceLocator
        .get(Service::class.java)
    app.doIt()
}