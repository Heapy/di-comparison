package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider implements Provider<Service> {

    @Inject
    private Service1 service;

    @Override
    public Service get() throws DIRuntimeException {
        return new DefaultService(service);
    }
}
