package com.rex.bean.a_type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Ball extends Toy { // 球

    public Ball(String name) {
        super(name);
    }
}