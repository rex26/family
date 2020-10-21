package com.linkedbear.spring.configuration.d_enablejdbc;

import com.linkedbear.spring.configuration.d_enablejdbc.config.JdbcConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfiguration.class)
public @interface EnableJdbc {

}