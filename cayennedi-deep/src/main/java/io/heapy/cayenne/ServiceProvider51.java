package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider51 implements Provider<Service51> {

    @Inject
    private Service52 service;

    @Override
    public Service51 get() throws DIRuntimeException {
        return new DefaultService51(service);
    }
}
