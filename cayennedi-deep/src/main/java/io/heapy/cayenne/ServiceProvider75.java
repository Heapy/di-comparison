package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider75 implements Provider<Service75> {

    @Inject
    private Service76 service;

    @Override
    public Service75 get() throws DIRuntimeException {
        return new DefaultService75(service);
    }
}
