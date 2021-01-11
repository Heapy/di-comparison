package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider28 implements Provider<Service28> {

    @Inject
    private Service29 service;

    @Override
    public Service28 get() throws DIRuntimeException {
        return new DefaultService28(service);
    }
}