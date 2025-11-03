package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider34 implements Provider<Service34> {

    @Inject
    private Service35 service;

    @Override
    public Service34 get() throws DIRuntimeException {
        return new DefaultService34(service);
    }
}
