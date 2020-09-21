package com.rex.ioc.annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlComponentScanApplication {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/xml_component_scan.xml");
        ComponentModel model = factory.getBean(ComponentModel.class);
        System.out.println(model);

    }
}
