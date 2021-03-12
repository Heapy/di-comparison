package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider62 implements Provider<Service62> {

    @Inject
    private Service63 service;

    @Override
    public Service62 get() throws DIRuntimeException {
        return new DefaultService62(service);
    }
}
