package io.heapy.springboot;

import io.heapy.sample.common2.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private Service service;

    public Runner(Service service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(service.name());
    }
}
