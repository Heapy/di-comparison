package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider69 implements Provider<Service69> {

    @Inject
    private Service70 service;

    @Override
    public Service69 get() throws DIRuntimeException {
        return new DefaultService69(service);
    }
}
