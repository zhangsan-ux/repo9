package com.itheima.spring.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class MyAspectXML {
    /*
    * 前置通知
    * @param joinPoint
    * */
    public void checkPri(JoinPoint joinPoint){
        System.out.println("权限校验================" +joinPoint);
    }
    /*
    * 后置通知
    * */
    public  void writeLog(Object result){
        System.out.println("写日志=============" +result);
    }
    /*
    * 环绕通知，性能监控
    * */
     public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
         System.out.println("环绕前通知**************************");
          Object obj=joinPoint.proceed();
         System.out.println("环绕后通知*********================***");
          return  obj;
     }
     /*
     * 异常抛出
     * */
     public void afterThrowing(Throwable throwable){
         System.out.println("异常抛出通知===================="+throwable.getMessage());
     }
     /*
     * 最终通知
     *
     * */
     public void myAfter(){
         System.out.println("最终通知=========");
     }
}

