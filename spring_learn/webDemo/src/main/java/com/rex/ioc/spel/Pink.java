package com.rex.ioc.spel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class Pink {
    @Value("#{'copy of ' + yellow.name}")
    public String name;

    @Value("#{yellow.order + 100}")
    public Integer order;
}
