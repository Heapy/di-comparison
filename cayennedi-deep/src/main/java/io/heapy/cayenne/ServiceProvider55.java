package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider55 implements Provider<Service55> {

    @Inject
    private Service56 service;

    @Override
    public Service55 get() throws DIRuntimeException {
        return new DefaultService55(service);
    }
}
