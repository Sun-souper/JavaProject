package com.qf.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component  //用于类对象的创建
@Aspect //声明为AOP
public class MyAspect {

    @Pointcut("execution(* com.qf.service.Impl.UserServiceImpl.*.*(..))")
    public void myPointcut() {
    }

    @Around("myPointcut()")
    public void myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        //1.目标方法前
        System.out.println("开启....");


        //2.目标方法
        joinPoint.proceed();

        //3.目标方法后
        System.out.println("关闭...");

    }
}
