package com.rex.ioc.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Controller 、@Service 、@Repository ，
 * 分别代表表现层、业务层、持久层。
 * 这三个注解的作用与 @Component 完全一致，其实它们的底层也就是 @Component
 * @Configuration也是@Component
 */
//@Controller
//@Service
//@Repository
@Component
public class ComponentModel {
}
