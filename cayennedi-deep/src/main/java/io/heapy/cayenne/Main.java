package io.heapy.cayenne;

import org.apache.cayenne.di.DIBootstrap;

public class Main {

    public static void main(String[] args) {
        Service s = DIBootstrap.createInjector(new MainModule()).getInstance(Service.class);
        System.out.println(s.name());
    }
}
