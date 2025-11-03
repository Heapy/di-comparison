package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider48 implements Provider<Service48> {

    @Inject
    private Service49 service;

    @Override
    public Service48 get() throws DIRuntimeException {
        return new DefaultService48(service);
    }
}
