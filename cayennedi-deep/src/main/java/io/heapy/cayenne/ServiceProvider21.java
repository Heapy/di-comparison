package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider21 implements Provider<Service21> {

    @Inject
    private Service22 service;

    @Override
    public Service21 get() throws DIRuntimeException {
        return new DefaultService21(service);
    }
}
