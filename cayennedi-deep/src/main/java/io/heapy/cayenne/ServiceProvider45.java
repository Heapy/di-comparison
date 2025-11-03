package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider45 implements Provider<Service45> {

    @Inject
    private Service46 service;

    @Override
    public Service45 get() throws DIRuntimeException {
        return new DefaultService45(service);
    }
}
