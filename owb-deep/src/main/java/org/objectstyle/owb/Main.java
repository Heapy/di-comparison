package org.objectstyle.owb;


import io.heapy.sample.common2.Service;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.CDI;

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
