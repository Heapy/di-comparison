package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider12 implements Provider<Service12> {

    @Inject
    private Service13 service;

    @Override
    public Service12 get() throws DIRuntimeException {
        return new DefaultService12(service);
    }
}