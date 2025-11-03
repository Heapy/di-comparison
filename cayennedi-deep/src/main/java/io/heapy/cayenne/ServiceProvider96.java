package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider96 implements Provider<Service96> {

    @Inject
    private Service97 service;

    @Override
    public Service96 get() throws DIRuntimeException {
        return new DefaultService96(service);
    }
}
