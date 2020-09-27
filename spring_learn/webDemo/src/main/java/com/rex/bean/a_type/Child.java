package com.rex.bean.a_type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Setter
@Getter
public class Child {

    // 当前的小孩子想玩球
    private String wantToy = "ball";
}
