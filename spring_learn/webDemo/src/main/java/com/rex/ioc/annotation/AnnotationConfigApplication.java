package com.rex.ioc.annotation;

import com.rex.ioc.basic_di.a_quickstart_set.Cat;
import com.rex.ioc.basic_dl.a_quickstart_byname.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;


public class AnnotationConfigApplication {

    public static void main1(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);

        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        // QuickstartConfiguration不加ComponentScan
        // 会报错:
        // NoSuchBeanDefinitionException:
        // No qualifying bean of type 'com.rex.ioc.annotation.ComponentModel' available
        ComponentModel componentModel = ctx.getBean(ComponentModel.class);
        System.out.println(componentModel);
    }

    public static void main2(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.rex.ioc.annotation");
        ComponentModel componentModel = ctx.getBean(ComponentModel.class);
        System.out.println(componentModel);
    }

    /**
     * @Configuration也是@Component
     *
     * @param args
     * @throws Exception
     */
    public static void main3(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        //或者直接扫描com.linkedbear.spring.annotation.c_scan包
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
    }

    public static void main4(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ImportXmlAnnotationConfiguration.class);
        //或者直接扫描com.linkedbear.spring.annotation.c_scan包
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
    }

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/xml_contain_annotation.xml");
        ComponentModel model = factory.getBean(ComponentModel.class);
        System.out.println(model);
    }
}
