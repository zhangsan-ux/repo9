package com.itheima.spring.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 注解的切面类
 * Create By cgc6868 on 2019/9/25
 */
@Aspect
public class MyAspectAnno {

    /*
    *前置通知
    * */
    @Before(value = "MyAspectAnno.pointCut2()")

    public void before(){
        System.out.println("前置通知---------");
    }
    /*
    * 后置通知
    * */
    @AfterReturning(value = "MyAspectAnno.pointCut4()",returning= "result")
    public void afterReturning(Object result){
        System.out.println("删除日志**********" +result);
    }
    @AfterReturning(value = "MyAspectAnno.pointCut3()",returning= "result")
    public void afterReturning1(Object result){
        System.out.println("删除日志**********" +result);
    }
    /*
    * 环绕通知
    * */
    @Around("MyAspectAnno.pointCut3()")
    public Object Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前增强***********");
        Object obj = joinPoint.proceed();
        System.out.println("环绕后增强");
        return obj;
    }
    /*
    * 异常通知
    * */
    @AfterThrowing(value = "MyAspectAnno.pointCut1()",throwing = "e")
    public void myThrowing( Throwable e){
        System.out.println("异常抛出***************" +e.getMessage());
    }
    /*
    * 最终通知
    * */
    @After( value ="MyAspectAnno.pointCut1()")
    public void myAfter(){
        System.out.println("最终通知*************");
    }
    /*
    * 切入点注解
    * */
    @Pointcut( value ="execution(* com.itheima.spring.demo1.OderDao.find(..))")
    public void pointCut1(){
    }
    @Pointcut( value ="execution(* com.itheima.spring.demo1.OderDao.save(..))")
    public void pointCut2(){
    }
    @Pointcut( value ="execution(* com.itheima.spring.demo1.OderDao.delete(..))")
    public void pointCut3(){
    }
    @Pointcut( value ="execution(* com.itheima.spring.demo1.OderDao.update(..))")
    public void pointCut4(){
    }

}
