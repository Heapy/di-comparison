package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider41 implements Provider<Service41> {

    @Inject
    private Service42 service;

    @Override
    public Service41 get() throws DIRuntimeException {
        return new DefaultService41(service);
    }
}