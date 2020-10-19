package com.linkedbear.spring.postprocessor.c_executetime;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ExecuteTimeBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof CECTDog) {
            System.out.println("postProcessBeforeInitialization ...");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof CECTDog) {
            System.out.println("postProcessAfterInitialization ...");
        }
        return bean;
    }
}
