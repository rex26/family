package com.rex.ioc.lazylookup;

import com.rex.ioc.basic_di.a_quickstart_set.Cat;
import com.rex.ioc.d_withanno.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyLookupApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        // 下面的代码会报Bean没有定义 NoSuchBeanDefinitionException
        // Dog dog = ctx.getBean(Dog.class);

        // 这一行代码不会报错
        ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);

        // 写法1
        Dog dog = dogProvider.getIfAvailable();
        if (dog == null) {
            dog = new Dog();
        }

        // 写法2 jdk8
        dog = dogProvider.getIfAvailable(() -> new Dog());
        // 写法3 jdk8
        dog = dogProvider.getIfAvailable(Dog::new);

        dogProvider.ifAvailable(wangwang -> System.out.println(wangwang)); // 或者使用方法引用

    }
}
