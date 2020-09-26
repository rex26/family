package com.rex.ioc.basic_di.g_complex;

import com.rex.ioc.basic_di.a_quickstart_set.Cat;
import com.rex.ioc.basic_dl.a_quickstart_byname.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexDataXmlApplication {

    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart-complex-data.xml");
        Knife person = beanFactory.getBean(Knife.class);
        System.out.println(person);
    }
}
