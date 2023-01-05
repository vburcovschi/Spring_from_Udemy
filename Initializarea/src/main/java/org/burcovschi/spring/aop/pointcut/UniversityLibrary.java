package org.burcovschi.spring.aop.pointcut;

import org.burcovschi.spring.aop.AbstractLibrary;
import org.burcovschi.spring.aop.Book;
import org.springframework.stereotype.Component;

@Component()
public class UniversityLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("get Book ");
    }

    public void returnBook(){
        System.out.println("return Book");
    }

    public void getMagazine(){
        System.out.println("get Magazine");
    }

    public void returnMagazine(){
        System.out.println("return Magazine");
    }

    public void addMagazine(){
        System.out.println("add Magazine");
    }

    public void addBook(){
        System.out.println("add Book");
    }

}
