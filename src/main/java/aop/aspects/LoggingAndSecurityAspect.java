package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
 /*   @Pointcut("execution (* aop.UniLibrary.get*())")
    private void allGetMettodsFromUnilityLibrary(){
    }
    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMettodsFromUnilityLibrary(){}

    @Pointcut("allGetMettodsFromUnilityLibrary()||allReturnMettodsFromUnilityLibrary()")
    public void allGetReturnMettodsFromUnilityLibrary(){
    }

    @Before ("allGetMettodsFromUnilityLibrary()")
    public void beforeGetLoggingAdvice()
    {
        System.out.println("beforeGetLoggingAdvice"+" "+"writing Lod1");
    }
    @Before ("allReturnMettodsFromUnilityLibrary()")
    public void beforeReturnLoggingAdvice()
    {
        System.out.println("beforeReturnLoggingAdvice"+" "+"writing Lod2");
    }

    @Before("allGetReturnMettodsFromUnilityLibrary()")
    public void beforeAllGetReturnMettodsFromUnilityLibrary()
    {
        System.out.println("beforeAllGetReturnMettodsFromUnilityLibrary"+"writing Lod3");
    }*/



    @Before("aop.aspects.MyPointcuts.allGetMetods()")
    public void beforeGetloggingAdvice()
    {
        System.out.println("beforeGetBookAdvice: логирование попытки получить журнал/книгу");
    }

}
