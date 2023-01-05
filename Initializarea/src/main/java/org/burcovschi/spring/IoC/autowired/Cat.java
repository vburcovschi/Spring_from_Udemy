package org.burcovschi.spring.IoC.autowired;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {

    public Cat(){
        System.out.println("Cat bean is created.");
    }
    @Override
    public void say(){
        System.out.println("Miau-miau");
    }
}
