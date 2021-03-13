package io.heapy.di.service

import org.springframework.stereotype.Component

@Component
class ServiceImpl(
    private val subService: SubService
) : Service {
    override fun doIt(): String {
        return "ServiceImpl_" + subService.doIt()
    }
}
