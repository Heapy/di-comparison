package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider14 implements Provider<Service14> {

    @Inject
    private Service15 service;

    @Override
    public Service14 get() throws DIRuntimeException {
        return new DefaultService14(service);
    }
}
