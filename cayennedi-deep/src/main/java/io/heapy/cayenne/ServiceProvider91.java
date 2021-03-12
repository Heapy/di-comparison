package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider91 implements Provider<Service91> {

    @Inject
    private Service92 service;

    @Override
    public Service91 get() throws DIRuntimeException {
        return new DefaultService91(service);
    }
}
