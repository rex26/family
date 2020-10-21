package com.linkedbear.spring.configuration.d_enablejdbc;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnClassNameConditional.class)
public @interface ConditionalOnClassName {

    String value();
}
