package io.heapy.bootique2;

import io.bootique.BQCoreModule;
import io.bootique.BaseModule;
import io.bootique.di.Binder;
import io.bootique.di.Provides;
import io.heapy.di.service.Service;
import io.heapy.di.service.ServiceImpl;
import io.heapy.di.service.SubService;
import io.heapy.di.service.SubServiceImpl;

import javax.inject.Singleton;

public class MainModule extends BaseModule  {

    @Override
    public void configure(Binder binder) {
        BQCoreModule.extend(binder).setDefaultCommand(MainCommand.class);
    }

    @Provides
    @Singleton
    Service provideService(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Provides
    @Singleton
    SubService provideSubService() {
        return new SubServiceImpl();
    }
}
