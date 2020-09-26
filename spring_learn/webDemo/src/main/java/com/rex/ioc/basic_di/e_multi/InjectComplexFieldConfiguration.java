package com.rex.ioc.basic_di.e_multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.rex.ioc.basic_di.e_multi")
public class InjectComplexFieldConfiguration {

    /**
     * configuration 直接就编译不过了....
     * <p>
     * Could not autowire. There is more than one bean of 'MultiTree' type.
     * Beans:
     * administrator   (MultiTree.java) master   (MultiTree.java)
     *
     * @param multiTree
     * @return
     */
    /*@Bean
    @Autowired // 高版本可不标注
    public MultiLeaf cat(MultiTree multiTree) {
        MultiLeaf cat = new MultiLeaf();
        cat.setName("mimi");
        cat.setTree(multiTree);
        return cat;
    }*/

    // 本来编译也不能通过的加上Qualifier就可以了
    @Autowired
    @Qualifier("administrator")
    public MultiTree multiTree;

    @Bean
    @Primary// @Qualifier 不受 @Primary 的干扰。
    public MultiTree master() {
        MultiTree master = new MultiTree();
        master.setName("master");
        return master;
    }
}
