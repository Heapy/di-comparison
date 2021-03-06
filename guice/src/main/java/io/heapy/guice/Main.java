package io.heapy.guice;

import com.google.inject.Guice;
import io.heapy.di.service.Service;

public class Main {

    public static void main(String[] args) {
        Service s = Guice.createInjector(new MainModule()).getInstance(Service.class);
        System.out.println(s.doIt());
    }
}
