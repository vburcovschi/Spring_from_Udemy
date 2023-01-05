package org.burcovschi.spring.IoC;

import org.burcovschi.spring.IoC.javacode.MyConfig;
import org.burcovschi.spring.IoC.javacode.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
