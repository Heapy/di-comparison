package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider37 implements Provider<Service37> {

    @Inject
    private Service38 service;

    @Override
    public Service37 get() throws DIRuntimeException {
        return new DefaultService37(service);
    }
}
