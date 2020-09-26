package com.rex.ioc.basic_di.e_multi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("administrator")
@Setter
@Getter
@ToString
public class MultiTree {
    private String name = "administrator";
}
