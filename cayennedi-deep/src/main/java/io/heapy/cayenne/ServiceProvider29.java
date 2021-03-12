package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider29 implements Provider<Service29> {

    @Inject
    private Service30 service;

    @Override
    public Service29 get() throws DIRuntimeException {
        return new DefaultService29(service);
    }
}
