package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider99 implements Provider<Service99> {

    @Inject
    private Service100 service;

    @Override
    public Service99 get() throws DIRuntimeException {
        return new DefaultService99(service);
    }
}
