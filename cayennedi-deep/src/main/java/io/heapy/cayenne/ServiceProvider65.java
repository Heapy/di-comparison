package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider65 implements Provider<Service65> {

    @Inject
    private Service66 service;

    @Override
    public Service65 get() throws DIRuntimeException {
        return new DefaultService65(service);
    }
}
