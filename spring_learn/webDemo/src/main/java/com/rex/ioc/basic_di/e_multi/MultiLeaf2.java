package com.rex.ioc.basic_di.e_multi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class MultiLeaf2 {
    @Value("多个bean")
    private String name;

    @Autowired
    private MultiTree administrator;
    // private MultiTree multiTree; 命名为administrator就不会报错

}
