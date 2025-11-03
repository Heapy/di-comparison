package io.heapy.cayenne;

import org.apache.cayenne.di.Binder;
import org.apache.cayenne.di.Module;

public class MainModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(Service.class).toProvider(SubServiceProvider.class);
        binder.bind(SubService.class).to(SubServiceImpl.class);
    }
}
