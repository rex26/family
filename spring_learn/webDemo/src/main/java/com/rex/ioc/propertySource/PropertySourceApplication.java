package com.rex.ioc.propertySource;

import com.rex.ioc.spel.Pink;
import com.rex.ioc.spel.White;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Red red = ctx.getBean(Red.class);
        Pink pink = ctx.getBean(Pink.class);
        White white = ctx.getBean(White.class);
        System.out.println("properties value : " + red);
        System.out.println("properties value : " + pink);
        System.out.println("properties value : " + white);
    }
}
