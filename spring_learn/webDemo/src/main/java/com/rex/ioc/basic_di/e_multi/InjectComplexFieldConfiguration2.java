package com.rex.ioc.basic_di.e_multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.rex.ioc.basic_di.e_multi")
public class InjectComplexFieldConfiguration2 {

    @Bean
    public MultiTree master() {
        MultiTree master = new MultiTree();
        master.setName("master");
        return master;
    }
}
