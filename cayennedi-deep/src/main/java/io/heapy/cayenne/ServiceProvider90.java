package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider90 implements Provider<Service90> {

    @Inject
    private Service91 service;

    @Override
    public Service90 get() throws DIRuntimeException {
        return new DefaultService90(service);
    }
}
