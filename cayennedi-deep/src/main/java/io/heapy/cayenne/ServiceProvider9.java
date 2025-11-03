package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider9 implements Provider<Service9> {

    @Inject
    private Service10 service;

    @Override
    public Service9 get() throws DIRuntimeException {
        return new DefaultService9(service);
    }
}
