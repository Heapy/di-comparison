package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider10 implements Provider<Service10> {

    @Inject
    private Service11 service;

    @Override
    public Service10 get() throws DIRuntimeException {
        return new DefaultService10(service);
    }
}
