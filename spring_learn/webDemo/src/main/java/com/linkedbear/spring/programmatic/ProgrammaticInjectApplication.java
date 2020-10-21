package com.linkedbear.spring.programmatic;

import com.linkedbear.spring.programmatic.bean.Cat;
import com.linkedbear.spring.programmatic.bean.Dog;
import com.linkedbear.spring.programmatic.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammaticInjectApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
                .addPropertyValue("name", "老王").getBeanDefinition();
        ctx.registerBeanDefinition("laowang", personDefinition);

        BeanDefinition catDefinition = BeanDefinitionBuilder.rootBeanDefinition(Cat.class)
                .addPropertyValue("name", "咪咪").addPropertyReference("person", "laowang")
                .getBeanDefinition();
        ctx.registerBeanDefinition("mimi", catDefinition);

        /*BeanDefinition dogDefinition = BeanDefinitionBuilder.rootBeanDefinition(Dog.class)
                .addPropertyValue("name", "汪汪").addPropertyReference("person", "laowang")
                .setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE).getBeanDefinition();
        ctx.registerBeanDefinition("wangwang", dogDefinition);*/

        BeanDefinition dogDefinition2 = BeanDefinitionBuilder.rootBeanDefinition(Dog.class)
                .addPropertyValue("name", "汪汪").addPropertyReference("person", "laowang")
                // .setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
                .setLazyInit(true)
                .getBeanDefinition();
        ctx.registerBeanDefinition("wangwang2", dogDefinition2);

        ctx.refresh();
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}
