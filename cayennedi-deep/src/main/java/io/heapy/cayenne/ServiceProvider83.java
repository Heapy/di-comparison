package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider83 implements Provider<Service83> {

    @Inject
    private Service84 service;

    @Override
    public Service83 get() throws DIRuntimeException {
        return new DefaultService83(service);
    }
}
