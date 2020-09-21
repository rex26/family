package com.rex.ioc.basic_di.a_quickstart_set;

import com.rex.ioc.basic_dl.a_quickstart_byname.Person;
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
