package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider85 implements Provider<Service85> {

    @Inject
    private Service86 service;

    @Override
    public Service85 get() throws DIRuntimeException {
        return new DefaultService85(service);
    }
}
