package com.rex.ioc.basic_di.h_aware;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LazyComponent {

    private LazyInjectBean person;

    @Autowired
    public void setPerson(ObjectProvider<LazyInjectBean> person) {
        // 有Bean才取出，注入
        this.person = person.getIfAvailable();
    }

    @Autowired
    public LazyComponent(ObjectProvider<LazyInjectBean> person) {
        // 如果没有Bean，则采用缺省策略创建
        this.person = person.getIfAvailable(LazyInjectBean::new);
    }

    @Autowired
    private ObjectProvider<LazyInjectBean> person2;

    @Override
    public String toString() {
        // 每用一次都要getIfAvailable一次
        return "Dog{" + "person=" + person2.getIfAvailable(LazyInjectBean::new) + '}';
    }
}
