package com.rex.bean.a_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class BeanTypeAnnoApplication {

    public static void main1(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        Toy toy = ctx.getBean(Toy.class);
        System.out.println(toy);
    }

    public static void main2(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
        toys.forEach((name, toy) -> {
            System.out.println("toy name : " + name + ", " + toy.toString());
        });
    }

    public static void main3(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        // Toy toy = ctx.getBean(Toy.class);
    }

    public static void main4(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        Toy toy1 = ctx.getBean(Toy.class);
        Toy toy2 = ctx.getBean(Toy.class);
        System.out.println(toy1 == toy2);
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        System.out.println(ctx.getBean("toyFactory"));
        System.out.println(ctx.getBean("&toyFactory"));
    }

    /*
    BeanFactory ：SpringFramework 中实现 IOC 的最底层容器（此处的回答可以从两种角度出发：从类的继承结构上看，它是最顶级的接口，也就是最顶层的容器实现；从类的组合结构上看，它则是最深层次的容器，ApplicationContext 在最底层组合了 BeanFactory ）

FactoryBean ：创建对象的工厂 Bean ，可以使用它来直接创建一些初始化流程比较复杂的对象
     */
}
