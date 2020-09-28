package com.rex.bean.a_type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    <bean id="child" class="com.rex.bean.a_type.Child"/>

    <bean id="toyFactory" class="com.rex.bean.a_type.ToyFactoryBean">
        <property name="child" ref="child"/>
    </bean>
 */

@Configuration
public class BeanTypeConfiguration {

    @Bean
    public Child child() {
        return new Child();
    }

    // 多个Ball对象
    /*@Bean
    public Toy ball() {
        return new Ball("ball");
    }*/

    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child());
        return toyFactory;
    }
}