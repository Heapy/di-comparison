package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider57 implements Provider<Service57> {

    @Inject
    private Service58 service;

    @Override
    public Service57 get() throws DIRuntimeException {
        return new DefaultService57(service);
    }
}
