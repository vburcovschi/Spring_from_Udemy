package org.burcovschi.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context.getBean("myPerson",Person.class);
        System.out.println("The "+ person.getSurname()+" has "+ person.getAge()+" years");

    }
}
