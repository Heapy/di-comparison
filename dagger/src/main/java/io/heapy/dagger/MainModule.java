package io.heapy.dagger;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class MainModule {

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
