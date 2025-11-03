package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider53 implements Provider<Service53> {

    @Inject
    private Service54 service;

    @Override
    public Service53 get() throws DIRuntimeException {
        return new DefaultService53(service);
    }
}
