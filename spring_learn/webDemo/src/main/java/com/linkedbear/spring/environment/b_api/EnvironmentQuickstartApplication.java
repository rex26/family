package com.linkedbear.spring.environment.b_api;

import com.linkedbear.spring.environment.a_quickstart.bean.EnvironmentHolder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentQuickstartApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                EnvironmentPropertyConfiguration.class);
        EnvironmentHolder environmentHolder = ctx.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();
    }
}