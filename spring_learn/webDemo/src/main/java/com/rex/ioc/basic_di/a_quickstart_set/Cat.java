package com.rex.ioc.basic_di.a_quickstart_set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Cat {
    private String name;
    private Person master;
    // getter and setter ......
}
