package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider64 implements Provider<Service64> {

    @Inject
    private Service65 service;

    @Override
    public Service64 get() throws DIRuntimeException {
        return new DefaultService64(service);
    }
}