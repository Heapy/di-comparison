package io.heapy.cayenne;

import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider1 implements Provider<Service1> {

    @Inject
    private Service2 service;

    @Override
    public Service1 get() throws DIRuntimeException {
        return new DefaultService1(service);
    }
}
