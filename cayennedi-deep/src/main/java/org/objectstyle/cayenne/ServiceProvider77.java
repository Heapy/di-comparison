package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider77 implements Provider<Service77> {

    @Inject
    private Service78 service;

    @Override
    public Service77 get() throws DIRuntimeException {
        return new DefaultService77(service);
    }
}