package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider84 implements Provider<Service84> {

    @Inject
    private Service85 service;

    @Override
    public Service84 get() throws DIRuntimeException {
        return new DefaultService84(service);
    }
}