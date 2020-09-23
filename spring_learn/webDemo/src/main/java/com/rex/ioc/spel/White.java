package com.rex.ioc.spel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@Setter
public class White {

    @Value("#{pink.name.substring(0, 3)}")
    public String name;

    @Value("#{T(java.lang.Integer).MAX_VALUE}")
    public Integer order;
}
