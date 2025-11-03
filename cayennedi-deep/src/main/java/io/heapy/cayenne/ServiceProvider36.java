package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider36 implements Provider<Service36> {

    @Inject
    private Service37 service;

    @Override
    public Service36 get() throws DIRuntimeException {
        return new DefaultService36(service);
    }
}
