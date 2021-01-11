package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider67 implements Provider<Service67> {

    @Inject
    private Service68 service;

    @Override
    public Service67 get() throws DIRuntimeException {
        return new DefaultService67(service);
    }
}