package com.rex.ioc.basic_di.e_multi;

import com.rex.ioc.basic_di.d_complexfield.Tree;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class MultiLeaf {
    @Value("多个bean")
    private String name;

    @Autowired
    @Qualifier("administrator")
    private MultiTree tree;

    public void setTree(MultiTree tree) {
        this.tree = tree;
    }
}
