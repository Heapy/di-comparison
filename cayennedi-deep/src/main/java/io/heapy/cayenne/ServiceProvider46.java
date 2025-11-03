package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider46 implements Provider<Service46> {

    @Inject
    private Service47 service;

    @Override
    public Service46 get() throws DIRuntimeException {
        return new DefaultService46(service);
    }
}
