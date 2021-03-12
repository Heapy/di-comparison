package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider93 implements Provider<Service93> {

    @Inject
    private Service94 service;

    @Override
    public Service93 get() throws DIRuntimeException {
        return new DefaultService93(service);
    }
}
