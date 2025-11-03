package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider59 implements Provider<Service59> {

    @Inject
    private Service60 service;

    @Override
    public Service59 get() throws DIRuntimeException {
        return new DefaultService59(service);
    }
}
