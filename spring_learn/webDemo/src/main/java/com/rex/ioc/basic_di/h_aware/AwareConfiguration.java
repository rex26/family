package com.rex.ioc.basic_di.h_aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwareConfiguration {

    @Bean
    public AwaredTestBean bbb() {
        return new AwaredTestBean();
    }

    @Bean
    public AwaredBeanName 我是bean的名字() {
        return new AwaredBeanName();
    }
}
