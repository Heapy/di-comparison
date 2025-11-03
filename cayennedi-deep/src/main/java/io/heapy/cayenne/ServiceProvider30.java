package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider30 implements Provider<Service30> {

    @Inject
    private Service31 service;

    @Override
    public Service30 get() throws DIRuntimeException {
        return new DefaultService30(service);
    }
}
