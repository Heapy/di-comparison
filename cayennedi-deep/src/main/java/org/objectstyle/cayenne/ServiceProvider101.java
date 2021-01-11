package org.objectstyle.cayenne;

import io.heapy.sample.common2.*;
import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class ServiceProvider101 implements Provider<Service101> {

    @Override
    public Service101 get() throws DIRuntimeException {
        return new DefaultService101();
    }
}
