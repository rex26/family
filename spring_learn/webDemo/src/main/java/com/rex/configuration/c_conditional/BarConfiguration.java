package com.rex.configuration.c_conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
//    @Conditional(ExistBossCondition.class)
    @ConditionalOnBean(beanNames = "com.rex.configuration.c_conditional.Boss")
    public Bar bbbar() {
        return new Bar();
    }
}
