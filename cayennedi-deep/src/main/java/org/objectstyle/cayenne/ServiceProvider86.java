package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider86 implements Provider<Service86> {

    @Inject
    private Service87 service;

    @Override
    public Service86 get() throws DIRuntimeException {
        return new DefaultService86(service);
    }
}