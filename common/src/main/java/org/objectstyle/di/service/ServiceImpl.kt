package org.objectstyle.di.service

class ServiceImpl(
    private val subService: SubService
) : Service {
    override fun doIt(): String {
        return "ServiceImpl_" + subService.doIt()
    }
}
