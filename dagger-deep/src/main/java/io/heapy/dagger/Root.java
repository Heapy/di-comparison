package io.heapy.dagger;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface Root {

    Service service();
}
