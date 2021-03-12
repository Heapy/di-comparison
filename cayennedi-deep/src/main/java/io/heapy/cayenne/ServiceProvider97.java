package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider97 implements Provider<Service97> {

    @Inject
    private Service98 service;

    @Override
    public Service97 get() throws DIRuntimeException {
        return new DefaultService97(service);
    }
}
