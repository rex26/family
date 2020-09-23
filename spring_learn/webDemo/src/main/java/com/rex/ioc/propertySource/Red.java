package com.rex.ioc.propertySource;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Red {
    @Value("${red.name}")
    private String name;
    @Value("${red.order}")
    private Integer order;
}
