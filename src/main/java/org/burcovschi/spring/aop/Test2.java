package org.burcovschi.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.burcovschi.spring.aop.pointcut.UniversityLibrary;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);

//        Book book = context.getBean("book",Book.class);

        universityLibrary.getBook();
        universityLibrary.returnBook();
        universityLibrary.getMagazine();
        universityLibrary.addBook();
        universityLibrary.returnMagazine();

/*        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();*/

        context.close();

    }
}
