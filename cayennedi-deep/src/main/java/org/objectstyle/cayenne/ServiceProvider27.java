package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider27 implements Provider<Service27> {

    @Inject
    private Service28 service;

    @Override
    public Service27 get() throws DIRuntimeException {
        return new DefaultService27(service);
    }
}