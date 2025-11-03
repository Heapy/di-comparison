package io.heapy.cayenne;


import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider39 implements Provider<Service39> {

    @Inject
    private Service40 service;

    @Override
    public Service39 get() throws DIRuntimeException {
        return new DefaultService39(service);
    }
}
