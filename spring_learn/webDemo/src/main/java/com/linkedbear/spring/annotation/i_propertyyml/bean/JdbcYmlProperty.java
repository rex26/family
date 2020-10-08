package com.linkedbear.spring.annotation.i_propertyyml.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class JdbcYmlProperty {

    @Value("${yml.jdbc.url}")
    private String url;

    @Value("${yml.jdbc.driver-class-name}")
    private String driverClassName;

    @Value("${yml.jdbc.username}")
    private String username;

    @Value("${yml.jdbc.password}")
    private String password;

    // 省略getter setter toString
}