package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider54 implements Provider<Service54> {

    @Inject
    private Service55 service;

    @Override
    public Service54 get() throws DIRuntimeException {
        return new DefaultService54(service);
    }
}