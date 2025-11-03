package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider52 implements Provider<Service52> {

    @Inject
    private Service53 service;

    @Override
    public Service52 get() throws DIRuntimeException {
        return new DefaultService52(service);
    }
}
