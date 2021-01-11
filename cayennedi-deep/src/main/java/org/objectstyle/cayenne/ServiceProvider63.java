package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider63 implements Provider<Service63> {

    @Inject
    private Service64 service;

    @Override
    public Service63 get() throws DIRuntimeException {
        return new DefaultService63(service);
    }
}