package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider4 implements Provider<Service4> {

    @Inject
    private Service5 service;

    @Override
    public Service4 get() throws DIRuntimeException {
        return new DefaultService4(service);
    }
}