package com.tw;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(* com.tw.Log.log())")
    public void pointCut() {}

    @Around("pointCut()")
    public void recordLog(ProceedingJoinPoint joinPoint) {
        System.out.println("before");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("exception");
        }
        System.out.println("after");

    }


}
