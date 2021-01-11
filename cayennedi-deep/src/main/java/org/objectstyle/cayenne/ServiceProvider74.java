package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider74 implements Provider<Service74> {

    @Inject
    private Service75 service;

    @Override
    public Service74 get() throws DIRuntimeException {
        return new DefaultService74(service);
    }
}