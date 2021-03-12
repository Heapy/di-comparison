package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider81 implements Provider<Service81> {

    @Inject
    private Service82 service;

    @Override
    public Service81 get() throws DIRuntimeException {
        return new DefaultService81(service);
    }
}
