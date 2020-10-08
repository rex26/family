package com.linkedbear.spring.annotation.g_propertysource.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class JdbcProperties {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driver-class-name}")
    private String driverClassName;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    // 省略getter setter toString
}
