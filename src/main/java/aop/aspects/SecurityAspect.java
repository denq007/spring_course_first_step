package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allGetMetods()allGetMetods()")
    public void beforeGetSeccurityAdvice()
    {
        System.out.println("beforeGetBookAdvice: проверка прав на получение книги/журнала");
    }
}
