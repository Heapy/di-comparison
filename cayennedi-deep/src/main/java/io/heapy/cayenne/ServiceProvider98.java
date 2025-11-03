package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider98 implements Provider<Service98> {

    @Inject
    private Service99 service;

    @Override
    public Service98 get() throws DIRuntimeException {
        return new DefaultService98(service);
    }
}
