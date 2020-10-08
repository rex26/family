package com.linkedbear.spring.definition.b_registry;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersonRegister.class)
public class BeanDefinitionRegistryConfiguration {

}
