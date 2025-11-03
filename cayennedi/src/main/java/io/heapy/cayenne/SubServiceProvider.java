package io.heapy.cayenne;

import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;

public class SubServiceProvider implements Provider<Service> {

    @Inject
    private SubService subService;

    @Override
    public Service get() throws DIRuntimeException {
        return new ServiceImpl(subService);
    }
}
