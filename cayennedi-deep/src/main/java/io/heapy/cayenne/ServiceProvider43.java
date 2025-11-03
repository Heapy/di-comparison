package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider43 implements Provider<Service43> {

    @Inject
    private Service44 service;

    @Override
    public Service43 get() throws DIRuntimeException {
        return new DefaultService43(service);
    }
}
