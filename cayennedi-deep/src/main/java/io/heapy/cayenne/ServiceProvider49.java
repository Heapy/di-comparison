package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider49 implements Provider<Service49> {

    @Inject
    private Service50 service;

    @Override
    public Service49 get() throws DIRuntimeException {
        return new DefaultService49(service);
    }
}
