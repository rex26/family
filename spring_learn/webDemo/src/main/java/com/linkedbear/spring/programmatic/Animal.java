package com.linkedbear.spring.programmatic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Animal {

    protected String name;

    protected Person person;

    public Animal() {
        System.out.println("Animal constructor run ......");
    }

    // getter setter toString
}
