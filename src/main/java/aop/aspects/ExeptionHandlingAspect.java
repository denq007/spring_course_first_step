package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExeptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allGetMetods()")
    public void beforeGetExeptionHandlingAdvice()
    {
        System.out.println("beforeGetExeptionHandlingAdvice: ловим/обрабатываем исключения при попытки получить книгу/журнал");
    }
}
