package com.rex.ioc.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:basic_dl/quickstart-byname.xml")
public class ImportXmlAnnotationConfiguration {
}
