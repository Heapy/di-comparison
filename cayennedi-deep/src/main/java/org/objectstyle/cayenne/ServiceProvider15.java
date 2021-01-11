package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider15 implements Provider<Service15> {

    @Inject
    private Service16 service;

    @Override
    public Service15 get() throws DIRuntimeException {
        return new DefaultService15(service);
    }
}