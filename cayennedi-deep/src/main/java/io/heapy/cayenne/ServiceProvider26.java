package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider26 implements Provider<Service26> {

    @Inject
    private Service27 service;

    @Override
    public Service26 get() throws DIRuntimeException {
        return new DefaultService26(service);
    }
}
