package com.rex.ioc.basic_di.h_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApplication {

    public static void main1(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredTestBean bbb = ctx.getBean(AwaredTestBean.class);
        bbb.printBeanNames();
    }

    // 多提一嘴，@Autowired 注入 SpringFramework 内置组件并不是在所有场景都适用的，
    // 后续 IOC 高级中会解释这个问题。
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredBeanName bbb = ctx.getBean(AwaredBeanName.class);
        bbb.printBeanNames();
        System.out.println("-----------");
        System.out.println(bbb.getName());
        System.out.println(bbb.getBeanName());
    }
}