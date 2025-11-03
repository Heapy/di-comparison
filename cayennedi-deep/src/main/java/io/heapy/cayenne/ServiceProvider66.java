package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider66 implements Provider<Service66> {

    @Inject
    private Service67 service;

    @Override
    public Service66 get() throws DIRuntimeException {
        return new DefaultService66(service);
    }
}
