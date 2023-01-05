package org.burcovschi.spring.IoC;

import org.burcovschi.spring.IoC.javacode.MyConfig;
import org.burcovschi.spring.IoC.javacode.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test9 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

/*        Pet cat1 = context.getBean("catBean",Pet.class);
        Pet cat2 = context.getBean("catBean",Pet.class);

        System.out.println("Are the cats same? "+(cat1==cat2));
        cat1.say();*/

        Person person = context.getBean("personBean",Person.class);
        System.out.println("Name "+person.getSurname()+", age "+person.getAge());
        person.callYourPet();
        context.close();
    }
}
