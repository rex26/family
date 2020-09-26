package com.rex.ioc.basic_di.d_complexfield;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Leaf {

    @Value("dogdog")
    private String name;

    /**
     * 1st
     *
     * @Autowired private Tree tree;
     * required = false 使得如果 Tree没有添加@Component注解也不会因此抛异常退出
     * 异常为: NoSuchBeanDefinitionException: No qualifying bean of type
     * Field injection is not recommended
     * Inspection info: Spring Team recommends:
     * "Always use constructor based dependency injection in your beans.
     * Always use assertions for mandatory dependencies".
     */
    @Autowired(required = false)
    private Tree tree;

    /** 2nd
     *
     * private Tree tree;
     *
     *     @Autowired
     *     public Leaf(Tree tree) {
     *         this.tree = tree;
     *     }
     */

    /** 3rd
     *
     * private Tree tree;
     *
     *     @Autowired
     *     public void setPerson(Tree tree) {
     *         this.tree = tree;
     *     }
     */

}
