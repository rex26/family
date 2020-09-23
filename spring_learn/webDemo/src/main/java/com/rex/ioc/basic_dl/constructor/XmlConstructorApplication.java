package com.rex.ioc.basic_dl.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConstructorApplication {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-xml-constructor.xml");
        Fish fish = (Fish) factory.getBean(Fish.class);
        System.out.println(fish);
    }
}
