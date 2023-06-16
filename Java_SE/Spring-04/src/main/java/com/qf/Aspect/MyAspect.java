package com.qf.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        //目标方法前
        System.out.println("开启事务等...");

        //执行目标方法
        Object proceed = joinPoint.proceed();

        //目标方法后
        System.out.println("提交事务等...");
        return proceed;
    }

    public Object myBefore(JoinPoint joinPoint) throws Throwable {
        //1.可以得到目标方法名
        String name = joinPoint.getSignature().getName();
        System.out.println("目标方法名:" + name);

        //2.目标对象
        Object target = joinPoint.getTarget();
        System.out.println("目标对象:" + target);

        //前置增强,通知
        System.out.println("前置通知(增强).....");


        return null;
    }
}
