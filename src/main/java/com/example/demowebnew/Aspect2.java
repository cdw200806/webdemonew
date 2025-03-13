package com.example.demowebnew;

import lombok.extern.apachecommons.CommonsLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class Aspect2 {
    @Around("@annotation(com.example.demowebnew.CDWannotation)")
    public Object printBefore(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("bbb");

        Object o = joinPoint.proceed();
        return "bbbadsfasdfsadfsaf";
    }

}
