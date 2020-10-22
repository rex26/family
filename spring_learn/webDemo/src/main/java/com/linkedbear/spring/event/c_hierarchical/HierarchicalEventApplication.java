package com.linkedbear.spring.event.c_hierarchical;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HierarchicalEventApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext parentCtx = new AnnotationConfigApplicationContext();
        parentCtx.addApplicationListener(new HierarchicalEventListener());

        AnnotationConfigApplicationContext childCtx = new AnnotationConfigApplicationContext();
        childCtx.setParent(parentCtx);
        childCtx.addApplicationListener(new HierarchicalEventListener());

    }
}
