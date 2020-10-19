package com.linkedbear.spring.postprocessor.f_destruction.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

@Getter
@Setter
public class Pen implements DisposableBean {

    private Integer ink = 100;

    @PreDestroy
    public void outwellInk() {
        System.out.println("Pen @PreDestroy 钢笔中的墨水都放干净了。。。");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pen DisposableBean 写完字了。。。");
    }

    // getter setter
}
