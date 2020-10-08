package com.linkedbear.spring.annotation.i_propertyyml;

import com.linkedbear.spring.annotation.i_propertyyml.fatory.YmlPropertySourceFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.linkedbear.spring.annotation.i_propertyyml.bean")
//@PropertySource("classpath:propertysource/jdbc.yml")
@PropertySource(value = "classpath:propertysource/jdbc.yml", factory = YmlPropertySourceFactory.class)
public class JdbcYmlConfiguration {

}