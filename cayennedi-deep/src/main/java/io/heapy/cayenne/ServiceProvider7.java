package io.heapy.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider7 implements Provider<Service7> {

    @Inject
    private Service8 service;

    @Override
    public Service7 get() throws DIRuntimeException {
        return new DefaultService7(service);
    }
}
