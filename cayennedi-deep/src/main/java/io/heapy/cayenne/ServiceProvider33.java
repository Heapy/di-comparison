package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider33 implements Provider<Service33> {

    @Inject
    private Service34 service;

    @Override
    public Service33 get() throws DIRuntimeException {
        return new DefaultService33(service);
    }
}
