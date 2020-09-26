package com.rex.ioc.basic_di.e_multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectMultiApplication2 {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration2.class);

        MultiLeaf2 cat = ctx.getBean(MultiLeaf2.class);
        System.out.println(cat);
    }
}
