package org.burcovschi.spring.IoC;

import org.burcovschi.spring.IoC.autowired.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();

    }
}
