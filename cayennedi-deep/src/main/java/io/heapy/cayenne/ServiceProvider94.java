package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider94 implements Provider<Service94> {

    @Inject
    private Service95 service;

    @Override
    public Service94 get() throws DIRuntimeException {
        return new DefaultService94(service);
    }
}
