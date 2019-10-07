package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By cgc6868 on 2019/9/22
 */
public class SpringDemo2 {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService =(CustomerService) applicationContext.getBean("customerService");
        CustomerService customerService1 =(CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);
        System.out.println(customerService1);

    }
}
