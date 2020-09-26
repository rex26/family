package com.rex.ioc.basic_di.f_resource;

import com.rex.ioc.basic_di.e_multi.MultiTree;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Component
@ToString
@Setter
@Getter
public class Bird {

    // 区别 如果万一项目中没有 SpringFramework 了，那么 @Autowired 注解将失效，
    // 但 @Inject 属于 JSR 规范，不会因为一个框架失效而失去它的意义
//    @Inject
//    @Named("inject")
//    @Autowired
//    @Qualifier("qualifier")

    // javax.annotation:javax.annotation-api:1.3.2 没有@Resource注解问题
    @Resource(name = "resource")
    private Huamei huamei;

    @Bean
    public Huamei resource() {
        Huamei huamei = new Huamei();
        huamei.name = "resource hua mei";

        return huamei;
    }

    @Bean
    public Huamei qualifier() {
        Huamei huamei = new Huamei();
        huamei.name = "qualifier hua mei";

        return huamei;
    }

    @Bean
    public Huamei inject() {
        Huamei huamei = new Huamei();
        huamei.name = "inject hua mei";

        return huamei;
    }
}
