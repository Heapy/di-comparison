package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider6 implements Provider<Service6> {

    @Inject
    private Service7 service;

    @Override
    public Service6 get() throws DIRuntimeException {
        return new DefaultService6(service);
    }
}
