package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider22 implements Provider<Service22> {

    @Inject
    private Service23 service;

    @Override
    public Service22 get() throws DIRuntimeException {
        return new DefaultService22(service);
    }
}