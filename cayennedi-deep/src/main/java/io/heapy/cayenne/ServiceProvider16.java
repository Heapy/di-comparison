package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider16 implements Provider<Service16> {

    @Inject
    private Service17 service;

    @Override
    public Service16 get() throws DIRuntimeException {
        return new DefaultService16(service);
    }
}
