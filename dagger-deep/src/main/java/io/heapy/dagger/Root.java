package io.heapy.dagger;

import dagger.Component;
import io.heapy.sample.common2.Service;

import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface Root {

    Service service();
}
