package io.heapy.owb;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

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
