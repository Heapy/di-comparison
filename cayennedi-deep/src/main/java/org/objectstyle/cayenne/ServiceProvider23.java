package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider23 implements Provider<Service23> {

    @Inject
    private Service24 service;

    @Override
    public Service23 get() throws DIRuntimeException {
        return new DefaultService23(service);
    }
}