package com.rex.ioc.basic_di.e_multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectMultiApplication3 {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration3.class);

        MultiLeaf3 cat = ctx.getBean(MultiLeaf3.class);
        System.out.println(cat);
    }
}
