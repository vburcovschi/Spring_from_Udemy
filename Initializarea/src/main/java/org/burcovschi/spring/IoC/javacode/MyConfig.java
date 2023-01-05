package org.burcovschi.spring.IoC.javacode;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("org.burcovschi.spring.IoC.javacode")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        //System.out.println("!!!!");
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
