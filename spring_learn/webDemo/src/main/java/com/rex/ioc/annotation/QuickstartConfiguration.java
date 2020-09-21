package com.rex.ioc.annotation;

import com.rex.ioc.basic_di.a_quickstart_set.Cat;
import com.rex.ioc.basic_dl.a_quickstart_byname.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rex.ioc.annotation")
public class QuickstartConfiguration {

    /*@Bean
    public Person person() {
        return new Person();
    }

    @Bean(name = "ImaId") // 4.3.3之后可以直接写value
    public Person person() {
        return new Person();
    }*/

    @Bean("ImaIdToo")
    public Person person() {
        Person person = new Person();
        person.setName("person");
        person.setAge(123);
        return person;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("test-cat-anno");
        // 直接拿上面的person()方法作为返回值即可，相当于ref
        cat.setMaster(person());
        return cat;
    }
}
