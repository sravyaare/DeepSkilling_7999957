package com.library.springcoremaven.exercise3.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint)
            throws Throwable {

        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();

        System.out.println(
                joinPoint.getSignature().getName()
                        + " executed in "
                        + (endTime - startTime)
                        + " ms");

        return result;
    }
}