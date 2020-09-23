package com.rex.ioc.basic_dl.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.rex.ioc.basic_dl.constructor");
        Black black = ctx.getBean(Black.class);
        System.out.println("simple value : " + black);
    }
}
