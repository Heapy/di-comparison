package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider89 implements Provider<Service89> {

    @Inject
    private Service90 service;

    @Override
    public Service89 get() throws DIRuntimeException {
        return new DefaultService89(service);
    }
}
