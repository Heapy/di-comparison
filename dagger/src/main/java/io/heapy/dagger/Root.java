package io.heapy.dagger;

import dagger.Component;
import io.heapy.di.service.Service;

import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface Root {

    Service service();
}
