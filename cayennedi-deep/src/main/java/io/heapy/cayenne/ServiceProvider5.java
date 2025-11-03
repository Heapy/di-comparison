package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider5 implements Provider<Service5> {

    @Inject
    private Service6 service;

    @Override
    public Service5 get() throws DIRuntimeException {
        return new DefaultService5(service);
    }
}
