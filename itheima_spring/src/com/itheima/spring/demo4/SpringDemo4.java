package com.itheima.spring.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 属性注入方式
 * Create By cgc6868 on 2019/9/20
 */
public class SpringDemo4 {
    @Test
    /*
    * 构造方法属性注入
    * */
    public void demo1 (){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
    /*
    * Set方法属性注入
    * */
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car2 =(Car2) applicationContext.getBean("car2");
        System.out.println(car2);
    }
    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       Employee employee =(Employee) applicationContext.getBean("employee");
        System.out.println(employee );
    }
}
