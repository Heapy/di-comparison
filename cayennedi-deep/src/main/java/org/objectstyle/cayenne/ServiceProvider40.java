package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider40 implements Provider<Service40> {

    @Inject
    private Service41 service;

    @Override
    public Service40 get() throws DIRuntimeException {
        return new DefaultService40(service);
    }
}