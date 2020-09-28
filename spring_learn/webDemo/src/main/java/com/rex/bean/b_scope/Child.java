package com.rex.bean.b_scope;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Child {
    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
