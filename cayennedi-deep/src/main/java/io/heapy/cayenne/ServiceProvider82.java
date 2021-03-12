package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider82 implements Provider<Service82> {

    @Inject
    private Service83 service;

    @Override
    public Service82 get() throws DIRuntimeException {
        return new DefaultService82(service);
    }
}
