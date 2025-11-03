package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider71 implements Provider<Service71> {

    @Inject
    private Service72 service;

    @Override
    public Service71 get() throws DIRuntimeException {
        return new DefaultService71(service);
    }
}
