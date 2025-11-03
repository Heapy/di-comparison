package io.heapy.bootique4;

import io.bootique.BQCoreModule;
import io.bootique.BQModule;
import io.bootique.di.Binder;
import io.bootique.di.Provides;
import io.heapy.di.service.Service;
import io.heapy.di.service.ServiceImpl;
import io.heapy.di.service.SubService;
import io.heapy.di.service.SubServiceImpl;

public class MainModule implements BQModule {

    @Override
    public void configure(Binder binder) {
        BQCoreModule.extend(binder).setDefaultCommand(MainCommand.class);
    }

    @Provides
    Service provideService(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Provides
    SubService provideSubService() {
        return new SubServiceImpl();
    }
}
