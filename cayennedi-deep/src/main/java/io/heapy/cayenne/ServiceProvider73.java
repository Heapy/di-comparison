package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider73 implements Provider<Service73> {

    @Inject
    private Service74 service;

    @Override
    public Service73 get() throws DIRuntimeException {
        return new DefaultService73(service);
    }
}
