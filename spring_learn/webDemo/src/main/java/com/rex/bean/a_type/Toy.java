package com.rex.bean.a_type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public abstract class Toy {

    private String name;

    public Toy(String name) {
        this.name = name;
    }

}
