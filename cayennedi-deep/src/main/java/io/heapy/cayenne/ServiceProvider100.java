package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider100 implements Provider<Service100> {

    @Inject
    private Service101 service;

    @Override
    public Service100 get() throws DIRuntimeException {
        return new DefaultService100(service);
    }
}
