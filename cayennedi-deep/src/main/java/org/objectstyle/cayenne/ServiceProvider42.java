package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider42 implements Provider<Service42> {

    @Inject
    private Service43 service;

    @Override
    public Service42 get() throws DIRuntimeException {
        return new DefaultService42(service);
    }
}