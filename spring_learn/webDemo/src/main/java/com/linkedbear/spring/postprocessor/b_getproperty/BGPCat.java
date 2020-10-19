package com.linkedbear.spring.postprocessor.b_getproperty;

import org.springframework.stereotype.Component;

@Component
public class BGPCat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}
