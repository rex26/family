package com.rex.bean.b_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("prototype")
// org.springframework.beans.factory.config.ConfigurableBeanFactory
public class Broswer {
    public Broswer() {
        System.out.println("Broswer constructor run ...");
    }
}
