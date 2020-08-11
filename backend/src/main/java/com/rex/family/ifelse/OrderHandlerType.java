package com.rex.family.ifelse;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author helios
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface OrderHandlerType {
    String source();
}
