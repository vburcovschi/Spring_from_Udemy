package org.burcovschi.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* org.burcovschi.spring.aop.pointcut.UniversityLibrary.*()))")
    private void allMethodsFromUniversityLibrary(){}

    @Pointcut("execution(public void org.burcovschi.spring.aop.pointcut.UniversityLibrary.returnMagazine())")
    private void returnMagazineFromUniversityLibrary(){
    }

    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
    private void allMethodsExceptReturnMagazineFromUniversityLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUniversityLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvise(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvise: Log #10");
    }

/*    @Pointcut("execution(* org.burcovschi.spring.aop.pointcut.UniversityLibrary.get*())")
    private void allGetMethodsFromUniversityLibrary(){}

    @Pointcut("execution(* org.burcovschi.spring.aop.pointcut.UniversityLibrary.return*())")
    private void UniversityLibrary(){}

    @Pointcut("allGetMethodsFromUniversityLibrary() || UniversityLibrary()")
    private void allGetAndReturnMethodsFromUniversityLibrary(){}

    @Before("allGetMethodsFromUniversityLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniversityLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }*/


/*    @Pointcut("execution(* get*())")
    private void loggingAllGetMethods(){};

    @Before("loggingAllGetMethods()")
    public  void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: Tentativă de primire a cărți/jurnal");
    }

    @Before("execution(public void returnBook())")
    public  void beforeReturnBook(){
        System.out.println("beforeReturnBook: Tentativă de intoarcere a cărții");
    }

    @Before("loggingAllGetMethods()")
    public  void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Verificrea drepturilor de primi carti sau reviste");
    }*/
}
