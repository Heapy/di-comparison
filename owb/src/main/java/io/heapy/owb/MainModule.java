package io.heapy.owb;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import io.heapy.di.service.Service;
import io.heapy.di.service.ServiceImpl;
import io.heapy.di.service.SubService;
import io.heapy.di.service.SubServiceImpl;

@ApplicationScoped
public class MainModule {

    @Produces
    @ApplicationScoped
    Service provideService(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Produces
    @ApplicationScoped
    SubService provideSubService() {
        return new SubServiceImpl();
    }
}
