package com.rex.ioc.basic_di.f_resource;

import com.rex.ioc.basic_di.e_multi.InjectComplexFieldConfiguration;
import com.rex.ioc.basic_di.e_multi.MultiLeaf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectMultiApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.rex.ioc.basic_di.f_resource");

        Bird cat = ctx.getBean(Bird.class);
        System.out.println(cat);
    }
}
