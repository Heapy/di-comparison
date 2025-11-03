package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider95 implements Provider<Service95> {

    @Inject
    private Service96 service;

    @Override
    public Service95 get() throws DIRuntimeException {
        return new DefaultService95(service);
    }
}
