package com.linkedbear.spring.event.c_hierarchical;

import org.springframework.context.ApplicationEvent;

public class HierarchicalEvent extends ApplicationEvent {

    public HierarchicalEvent(Object source) {
        super(source);
    }
}
