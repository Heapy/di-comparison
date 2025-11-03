package io.heapy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @Bean
    public Service service(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Bean
    public SubService subService() {
        return new SubServiceImpl();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(context.getBean(Service.class).doIt());
    }
}
