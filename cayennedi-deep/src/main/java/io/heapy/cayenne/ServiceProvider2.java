package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider2 implements Provider<Service2> {

    @Inject
    private Service3 service;

    @Override
    public Service2 get() throws DIRuntimeException {
        return new DefaultService2(service);
    }
}
