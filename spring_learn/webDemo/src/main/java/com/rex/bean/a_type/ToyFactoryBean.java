package com.rex.bean.a_type;

import org.springframework.beans.factory.FactoryBean;

public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                // SpringFramework2.0开始允许返回null
                // 之前的1.x版本是不允许的
                return null;
        }
    }


    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }


}