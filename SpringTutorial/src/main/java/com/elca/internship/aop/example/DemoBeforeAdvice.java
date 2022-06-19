package com.elca.internship.aop.example;

import java.lang.reflect.Method;

public class DemoBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before method: " + method.getName());
    }
}
