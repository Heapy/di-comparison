package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider18 implements Provider<Service18> {

    @Inject
    private Service19 service;

    @Override
    public Service18 get() throws DIRuntimeException {
        return new DefaultService18(service);
    }
}
