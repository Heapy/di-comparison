package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider38 implements Provider<Service38> {

    @Inject
    private Service39 service;

    @Override
    public Service38 get() throws DIRuntimeException {
        return new DefaultService38(service);
    }
}