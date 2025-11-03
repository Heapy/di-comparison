package io.heapy.cayenne;

import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider implements Provider<Service> {

    @Inject
    private Service1 service;

    @Override
    public Service get() throws DIRuntimeException {
        return new DefaultService(service);
    }
}
