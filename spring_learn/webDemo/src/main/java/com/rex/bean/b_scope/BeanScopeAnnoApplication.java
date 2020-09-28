package com.rex.bean.b_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeAnnoApplication {
    public static void main1(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        // 默认情况下，Bean 的作用域是单实例的。
        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }
    
    public static void main2(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration2.class);
        // Spring 官方的定义是：每次对原型 Bean 提出请求时，都会创建一个新的 Bean 实例。
        // 这里面提到的 ”提出请求“ ，包括任何依赖查找、依赖注入的动作，都算做一次 ”提出请求“ 。
        ctx.getBeansOfType(Chrome.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration2.class);
    }
}
