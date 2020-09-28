package com.rex.bean.b_scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rex.bean.b_scope")
public class BeanScopeConfiguration2 {

    @Bean
    public Chrome child1(Broswer toy) {
        Chrome child = new Chrome();
        child.setBroswer(toy);
        return child;
    }

    @Bean
    public Chrome child2(Broswer toy) {
        Chrome child = new Chrome();
        child.setBroswer(toy);
        return child;
    }

}