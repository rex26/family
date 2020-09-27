package com.rex.bean.a_type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Car extends Toy { // 玩具汽车

    public Car(String name) {
        super(name);
    }
}