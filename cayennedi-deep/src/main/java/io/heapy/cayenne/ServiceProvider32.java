package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider32 implements Provider<Service32> {

    @Inject
    private Service33 service;

    @Override
    public Service32 get() throws DIRuntimeException {
        return new DefaultService32(service);
    }
}
