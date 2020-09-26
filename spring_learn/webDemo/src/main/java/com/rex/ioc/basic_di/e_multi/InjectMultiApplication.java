package com.rex.ioc.basic_di.e_multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectMultiApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);

        MultiLeaf cat = ctx.getBean(MultiLeaf.class);
        System.out.println(cat);
    }
}
