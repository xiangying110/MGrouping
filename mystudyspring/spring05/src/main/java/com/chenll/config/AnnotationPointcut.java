package com.chenll.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect//标注这个类是个切面
public class AnnotationPointcut {
    @Before("execution(* com.chenll.aop.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("---------方法执行前---------");
    }
    @After("execution(* com.chenll.aop.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("---------方法执行后---------");
    }
    @Around("execution(* com.chenll.aop.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());  //接入点
//执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
