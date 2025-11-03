package io.heapy.owb

interface Service {
    fun doIt(): String
}

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

class SubServiceImpl : SubService {
    override fun doIt(): String {
        return "SubServiceImpl"
    }
}
