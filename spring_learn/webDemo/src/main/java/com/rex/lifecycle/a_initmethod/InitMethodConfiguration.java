package com.rex.lifecycle.a_initmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitMethodConfiguration {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("wangwang");
        return dog;
    }
}
