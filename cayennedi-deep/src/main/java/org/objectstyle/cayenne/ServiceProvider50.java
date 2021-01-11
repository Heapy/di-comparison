package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider50 implements Provider<Service50> {

    @Inject
    private Service51 service;

    @Override
    public Service50 get() throws DIRuntimeException {
        return new DefaultService50(service);
    }
}