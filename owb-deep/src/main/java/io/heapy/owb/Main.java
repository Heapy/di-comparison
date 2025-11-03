package io.heapy.owb;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.CDI;

public class Main {

    public static void main(String[] args) {
        SeContainer cdiContainer = SeContainerInitializer.newInstance()
                .disableDiscovery()
                .addBeanClasses(MainModule.class)
                .initialize();
        Service s = CDI.current().select(Service.class).get();

        System.out.println(s.name());
    }
}
