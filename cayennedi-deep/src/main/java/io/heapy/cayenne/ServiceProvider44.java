package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider44 implements Provider<Service44> {

    @Inject
    private Service45 service;

    @Override
    public Service44 get() throws DIRuntimeException {
        return new DefaultService44(service);
    }
}
