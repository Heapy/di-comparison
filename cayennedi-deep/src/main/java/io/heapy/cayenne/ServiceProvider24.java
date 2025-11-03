package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider24 implements Provider<Service24> {

    @Inject
    private Service25 service;

    @Override
    public Service24 get() throws DIRuntimeException {
        return new DefaultService24(service);
    }
}
