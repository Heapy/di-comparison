package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider80 implements Provider<Service80> {

    @Inject
    private Service81 service;

    @Override
    public Service80 get() throws DIRuntimeException {
        return new DefaultService80(service);
    }
}
