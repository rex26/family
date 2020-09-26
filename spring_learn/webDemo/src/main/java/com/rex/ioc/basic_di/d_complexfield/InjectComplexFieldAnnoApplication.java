package com.rex.ioc.basic_di.d_complexfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectComplexFieldAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.rex.ioc.basic_di.d_complexfield");
        Leaf dog = ctx.getBean(Leaf.class);
        System.out.println(dog);
    }
}
