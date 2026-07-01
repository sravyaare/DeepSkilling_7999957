package com.library.springcoremaven.exercise8.aspect;

public class LoggingAspect {

    public void beforeMethodExecution() {
        System.out.println("AOP Log: Method execution started");
    }

    public void afterMethodExecution() {
        System.out.println("AOP Log: Method execution completed");
    }
}