package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider78 implements Provider<Service78> {

    @Inject
    private Service79 service;

    @Override
    public Service78 get() throws DIRuntimeException {
        return new DefaultService78(service);
    }
}