package com.rex.ioc.basic_di.g_complex;

import com.rex.ioc.basic_di.f_resource.Bird;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComlexDataAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.rex.ioc.basic_di.g_complex");

        Knife cat = ctx.getBean(Knife.class);
        System.out.println(cat);
    }
}
