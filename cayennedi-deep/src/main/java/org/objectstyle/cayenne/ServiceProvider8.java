package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider8 implements Provider<Service8> {

    @Inject
    private Service9 service;

    @Override
    public Service8 get() throws DIRuntimeException {
        return new DefaultService8(service);
    }
}