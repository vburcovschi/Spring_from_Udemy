package org.burcovschi.spring.IoC.javacode;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Autowired
    public Person(/*@Qualifier("dogBean")*/ Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }
 /*   public Person() {
        System.out.println("Person bean is created");
    }*/

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
