package com.qf.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect  // 表示该类是切面类
public class MyAspect {

    @Pointcut("execution(* com.qf.Service.Impl.UserServiceImpl.findById())")
    public void myPointcut() {
    }

    @Around("myPointcut()")
    public void myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 目标方法前
        // 目标方法前:
        System.out.println("开启事务/权限校验");

        // 目标方法执行
        joinPoint.proceed();
        // 目标方法后:
        System.out.println("提交事务/日志记录");
    }
}
