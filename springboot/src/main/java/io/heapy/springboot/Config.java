package io.heapy.springboot;

import io.heapy.di.service.Service;
import io.heapy.di.service.ServiceImpl;
import io.heapy.di.service.SubService;
import io.heapy.di.service.SubServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Service service(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Bean
    public SubService subService() {
        return new SubServiceImpl();
    }
}
