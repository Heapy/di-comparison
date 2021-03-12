package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider47 implements Provider<Service47> {

    @Inject
    private Service48 service;

    @Override
    public Service47 get() throws DIRuntimeException {
        return new DefaultService47(service);
    }
}
