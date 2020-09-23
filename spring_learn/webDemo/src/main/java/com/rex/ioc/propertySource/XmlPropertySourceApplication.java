package com.rex.ioc.propertySource;

import com.rex.ioc.spel.Pink;
import com.rex.ioc.spel.White;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlPropertySourceApplication {
    public static void main1(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-xml-property.xml");
        Blue blue = factory.getBean(Blue.class);
        System.out.println(blue);
    }

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-xml-spel.xml");
        Blue blue = factory.getBean(Blue.class);
        Pink pink = factory.getBean(Pink.class);
        White white = factory.getBean(White.class);
        System.out.println(blue);
        System.out.println(pink);
        System.out.println(white);
    }
}
