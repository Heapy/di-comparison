package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider35 implements Provider<Service35> {

    @Inject
    private Service36 service;

    @Override
    public Service35 get() throws DIRuntimeException {
        return new DefaultService35(service);
    }
}
