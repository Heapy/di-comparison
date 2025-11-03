package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider60 implements Provider<Service60> {

    @Inject
    private Service61 service;

    @Override
    public Service60 get() throws DIRuntimeException {
        return new DefaultService60(service);
    }
}
