package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider58 implements Provider<Service58> {

    @Inject
    private Service59 service;

    @Override
    public Service58 get() throws DIRuntimeException {
        return new DefaultService58(service);
    }
}
