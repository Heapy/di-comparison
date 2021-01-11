package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider88 implements Provider<Service88> {

    @Inject
    private Service89 service;

    @Override
    public Service88 get() throws DIRuntimeException {
        return new DefaultService88(service);
    }
}