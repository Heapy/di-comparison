package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider70 implements Provider<Service70> {

    @Inject
    private Service71 service;

    @Override
    public Service70 get() throws DIRuntimeException {
        return new DefaultService70(service);
    }
}
