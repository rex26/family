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

    /** 1st
     * Field injection is not recommended
     *       Inspection info: Spring Team recommends:
     *       "Always use constructor based dependency injection in your beans.
     *       Always use assertions for mandatory dependencies".
     */
    //
    @Autowired
    private Tree tree;

    // @Autowired(required = false)
    @Autowired
    private NoAnnotationTree noAnnotationTree;

    /**
     * 2nd
     * @param tree
     */
    @Autowired
    public Leaf(Tree tree) {
        this.tree = tree;
    }

    /**
     * 3rd
     * @param tree
     */
    @Autowired
    public void setTree(Tree tree) {
        this.tree = tree;
    }
}
