package io.heapy.dimension

import jakarta.inject.Inject
import jakarta.inject.Singleton

interface Service {
    fun doIt(): String
}

@Singleton
class ServiceImpl @Inject constructor(
    private val subService: SubService
) : Service {
    override fun doIt(): String {
        return "ServiceImpl_" + subService.doIt()
    }
}

interface SubService {
    fun doIt(): String
}

@Singleton
class SubServiceImpl : SubService {
    override fun doIt(): String {
        return "SubServiceImpl"
    }
}
