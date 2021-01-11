package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider87 implements Provider<Service87> {

    @Inject
    private Service88 service;

    @Override
    public Service87 get() throws DIRuntimeException {
        return new DefaultService87(service);
    }
}