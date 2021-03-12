package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider11 implements Provider<Service11> {

    @Inject
    private Service12 service;

    @Override
    public Service11 get() throws DIRuntimeException {
        return new DefaultService11(service);
    }
}
