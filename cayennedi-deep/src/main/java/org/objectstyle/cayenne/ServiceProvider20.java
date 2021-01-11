package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider20 implements Provider<Service20> {

    @Inject
    private Service21 service;

    @Override
    public Service20 get() throws DIRuntimeException {
        return new DefaultService20(service);
    }
}