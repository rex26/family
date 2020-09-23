package com.rex.ioc.propertySource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// 顺便加上包扫描
@ComponentScan({"com.rex.ioc.propertySource", "com.rex.ioc.spel"})
@PropertySource("classpath:red.properties")
public class InjectValueConfiguration {
}
