package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider3 implements Provider<Service3> {

    @Inject
    private Service4 service;

    @Override
    public Service3 get() throws DIRuntimeException {
        return new DefaultService3(service);
    }
}