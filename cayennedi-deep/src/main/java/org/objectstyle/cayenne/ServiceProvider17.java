package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider17 implements Provider<Service17> {

    @Inject
    private Service18 service;

    @Override
    public Service17 get() throws DIRuntimeException {
        return new DefaultService17(service);
    }
}