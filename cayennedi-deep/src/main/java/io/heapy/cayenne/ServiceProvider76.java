package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider76 implements Provider<Service76> {

    @Inject
    private Service77 service;

    @Override
    public Service76 get() throws DIRuntimeException {
        return new DefaultService76(service);
    }
}
