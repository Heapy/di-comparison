package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider56 implements Provider<Service56> {

    @Inject
    private Service57 service;

    @Override
    public Service56 get() throws DIRuntimeException {
        return new DefaultService56(service);
    }
}