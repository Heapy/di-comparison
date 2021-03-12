package io.heapy.cayenne;

import org.apache.cayenne.di.Binder;
import org.apache.cayenne.di.Module;
import io.heapy.di.service.Service;
import io.heapy.di.service.SubService;
import io.heapy.di.service.SubServiceImpl;

public class MainModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(Service.class).toProvider(SubServiceProvider.class);
        binder.bind(SubService.class).to(SubServiceImpl.class);
    }
}
