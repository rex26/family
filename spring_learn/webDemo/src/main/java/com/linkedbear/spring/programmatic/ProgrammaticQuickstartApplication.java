package com.linkedbear.spring.programmatic;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammaticQuickstartApplication {

    public static void main1(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }

    public static void main2(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();
        ctx.registerBeanDefinition("person", personDefinition);

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
                .addPropertyValue("name", "zhangsan").getBeanDefinition();
        ctx.registerBeanDefinition("person", personDefinition);
        ctx.refresh();

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
