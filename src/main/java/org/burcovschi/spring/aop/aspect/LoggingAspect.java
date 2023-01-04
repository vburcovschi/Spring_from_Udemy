package org.burcovschi.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook(org.burcovschi.spring.aop.Book))")
    public  void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Tentativă de primire a cărții");
    }

    @Before("execution(public void returnBook())")
    public  void beforeReturnBook(){
        System.out.println("beforeReturnBook: Tentativă de intoarcere a cărții");
    }
}
