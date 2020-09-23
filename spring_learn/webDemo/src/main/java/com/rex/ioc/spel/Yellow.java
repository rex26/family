package com.rex.ioc.spel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("yellow")
@Getter
@Setter
@ToString
public class Yellow {
    @Value("#{'blue-value-byspel'}")
    private String name;

    @Value("#{2}")
    private Integer order;
}
