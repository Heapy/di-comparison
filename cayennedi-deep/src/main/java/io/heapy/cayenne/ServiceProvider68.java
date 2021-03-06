package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider68 implements Provider<Service68> {

    @Inject
    private Service69 service;

    @Override
    public Service68 get() throws DIRuntimeException {
        return new DefaultService68(service);
    }
}
