package com.rex.ioc.basic_dl.a_quickstart_byname;

import com.rex.ioc.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByNameApplication {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = factory.getBean(DemoDao.class);
        System.out.println(demoDao.findAll());
    }

    public static void main2(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
