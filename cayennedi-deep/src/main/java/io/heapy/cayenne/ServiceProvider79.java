package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider79 implements Provider<Service79> {

    @Inject
    private Service80 service;

    @Override
    public Service79 get() throws DIRuntimeException {
        return new DefaultService79(service);
    }
}
