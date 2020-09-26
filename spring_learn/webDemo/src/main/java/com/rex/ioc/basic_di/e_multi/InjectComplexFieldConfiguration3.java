package com.rex.ioc.basic_di.e_multi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rex.ioc.basic_di.e_multi")
public class InjectComplexFieldConfiguration3 {

    @Bean
    public MultiTree master() {
        MultiTree master = new MultiTree();
        master.setName("master");
        return master;
    }
}
