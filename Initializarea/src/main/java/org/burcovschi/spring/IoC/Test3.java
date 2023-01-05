package org.burcovschi.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Pet pet = new Dog();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson",Person.class);
        person.callYourPet();
        System.out.println("The "+ person.getSurname()+" has "+ person.getAge()+" years");
        context.close();
    }
}
