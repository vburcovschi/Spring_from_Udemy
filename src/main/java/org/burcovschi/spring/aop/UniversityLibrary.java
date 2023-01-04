package org.burcovschi.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary /*extends AbstractLibrary*/ {

 //   @Override
    public void getBook(Book book){
        System.out.println("Noi luam o carte din UnivercityLibrary " +book.getName());
    }

    public void returnBook(){
        System.out.println("Noi intoarcem cartea in UnivercotyLibrary");
    }

    public void getMagazine(){
        System.out.println("Noi luam o revista");
    }
}
