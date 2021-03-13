package io.heapy.di.service

import org.springframework.stereotype.Component

@Component
class SubServiceImpl : SubService {
    override fun doIt(): String {
        return "SubServiceImpl"
    }
}
