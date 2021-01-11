package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider72 implements Provider<Service72> {

    @Inject
    private Service73 service;

    @Override
    public Service72 get() throws DIRuntimeException {
        return new DefaultService72(service);
    }
}