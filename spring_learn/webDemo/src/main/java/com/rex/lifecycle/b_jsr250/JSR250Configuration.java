package com.rex.lifecycle.b_jsr250;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSR250Configuration {

    // JSR250 规范的执行优先级高于 init / destroy。
    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen pen() {
        return new Pen();
    }
}
