package com.rex.ioc.basic_di.e_multi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
@ToString
public class MultiLeaf3 {
    @Value("多个bean")
    private String name;

    @Autowired
    private List<MultiTree> multiTrees;

}
