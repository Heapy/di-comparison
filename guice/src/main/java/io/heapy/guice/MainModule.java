package io.heapy.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import io.heapy.di.service.Service;
import io.heapy.di.service.ServiceImpl;
import io.heapy.di.service.SubService;
import io.heapy.di.service.SubServiceImpl;

import javax.inject.Singleton;

public class MainModule implements Module {

    @Override
    public void configure(Binder binder) {
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
