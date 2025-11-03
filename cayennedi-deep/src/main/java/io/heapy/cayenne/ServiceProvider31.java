package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider31 implements Provider<Service31> {

    @Inject
    private Service32 service;

    @Override
    public Service31 get() throws DIRuntimeException {
        return new DefaultService31(service);
    }
}
