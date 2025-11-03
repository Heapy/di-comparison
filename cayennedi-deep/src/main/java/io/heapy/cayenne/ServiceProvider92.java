package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider92 implements Provider<Service92> {

    @Inject
    private Service93 service;

    @Override
    public Service92 get() throws DIRuntimeException {
        return new DefaultService92(service);
    }
}
