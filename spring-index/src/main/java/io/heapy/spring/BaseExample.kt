package io.heapy.spring

import org.springframework.stereotype.Component

interface Service {
    fun doIt(): String
}

@Component
class ServiceImpl(
    private val subService: SubService
) : Service {
    override fun doIt(): String {
        return "ServiceImpl_" + subService.doIt()
    }
}

interface SubService {
    fun doIt(): String
}

@Component
class SubServiceImpl : SubService {
    override fun doIt(): String {
        return "SubServiceImpl"
    }
}
