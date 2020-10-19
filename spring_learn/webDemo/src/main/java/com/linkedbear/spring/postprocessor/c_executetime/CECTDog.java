package com.linkedbear.spring.postprocessor.c_executetime;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class CECTDog implements InitializingBean {

    public void initMethod() {
        System.out.println("initMethod ...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean ...");
    }
}