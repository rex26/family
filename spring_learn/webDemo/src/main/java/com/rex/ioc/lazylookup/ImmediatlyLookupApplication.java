package com.rex.ioc.lazylookup;

import com.rex.ioc.basic_di.a_quickstart_set.Cat;
import com.rex.ioc.d_withanno.Dog;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImmediatlyLookupApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        // 1.用try catch判断
        Dog dog;
        try {
            dog = ctx.getBean(Dog.class);
        } catch (NoSuchBeanDefinitionException e) {
            // 找不到Dog时手动创建
            dog = new Dog();
        }

        // 2.用id 判断
        dog = ctx.containsBean("dog") ? (Dog) ctx.getBean("dog") : new Dog();


        System.out.println(dog);
    }

}
