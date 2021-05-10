package user.com.aspect;//package com.user.com.aspect;
//
//import com.user.com.annotation.RedisFilter;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class RedisAspect {
//    @Pointcut("@annotation(com.user.com.annotation.RedisFilter)")
//    public void dataFilterCut() {
//
//    }
//    @Before("dataFilterCut()")
//    private void redisFilter(JoinPoint point){
//        MethodSignature signature = (MethodSignature) point.getSignature();
//        RedisFilter dataFilter = signature.getMethod().getAnnotation(RedisFilter.class);
//        System.out.println("进来了:"+dataFilter);
//    }
//}
