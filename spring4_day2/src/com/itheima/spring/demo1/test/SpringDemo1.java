package com.itheima.spring.demo1.test;

import com.itheima.spring.demo1.dao.UserDao;
import com.itheima.spring.demo1.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * spring的ioc 的注解来发测试类
 * Create By cgc6868 on 2019/9/22
 */
public class SpringDemo1 {
   @Test
    public void demo1(){
       UserDao  userDao = new UserDaoImpl();
       userDao.save();
    }
    //Spring的IOC的注解方式
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         UserDao userDao=(UserDao) applicationContext.getBean("userDao");
         userDao.save();
    }

}
