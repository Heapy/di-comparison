package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider61 implements Provider<Service61> {

    @Inject
    private Service62 service;

    @Override
    public Service61 get() throws DIRuntimeException {
        return new DefaultService61(service);
    }
}
