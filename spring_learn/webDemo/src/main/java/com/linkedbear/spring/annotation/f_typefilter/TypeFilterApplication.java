package com.linkedbear.spring.annotation.f_typefilter;

import com.linkedbear.spring.annotation.e_basepackageclass.bean.DemoService;
import com.linkedbear.spring.annotation.e_basepackageclass.component.DemoComponent;
import com.linkedbear.spring.annotation.e_basepackageclass.config.BasePackageClassConfiguration;
import com.linkedbear.spring.annotation.f_typefilter.config.TypeFilterConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

public class TypeFilterApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TypeFilterConfiguration.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
