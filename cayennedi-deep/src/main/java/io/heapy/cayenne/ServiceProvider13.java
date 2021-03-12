package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider13 implements Provider<Service13> {

    @Inject
    private Service14 service;

    @Override
    public Service13 get() throws DIRuntimeException {
        return new DefaultService13(service);
    }
}
