package com.rex.ioc.basic_di.g_complex;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("miaomiao")
@Setter
@Getter
@ToString
public class Sliver {
    private String name = "cat";
}
