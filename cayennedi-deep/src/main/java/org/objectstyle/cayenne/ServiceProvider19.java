package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider19 implements Provider<Service19> {

    @Inject
    private Service20 service;

    @Override
    public Service19 get() throws DIRuntimeException {
        return new DefaultService19(service);
    }
}