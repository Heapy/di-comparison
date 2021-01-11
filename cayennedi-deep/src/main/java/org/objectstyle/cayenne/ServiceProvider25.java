package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider25 implements Provider<Service25> {

    @Inject
    private Service26 service;

    @Override
    public Service25 get() throws DIRuntimeException {
        return new DefaultService25(service);
    }
}