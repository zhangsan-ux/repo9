package com.itheima.spring.demo1.test;

import com.itheima.spring.demo1.dao.UserDAO;
import com.itheima.spring.demo1.impl.UserDAOImpl;
import it.heima.spring.demo2.dao.CustomerDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring入门
 * Create By cgc6868 on 2019/9/20
 */
public class SpringDemo1 {
    @Test
    public void demo1(){
        UserDAOImpl dao  = new UserDAOImpl();
        dao.setName("王东");
        dao.say();
    }
    /*
    * spring 方式调用
    *
    * */
    @Test
    public void demo2(){
        //创建Spring的工厂
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO=(UserDAO) applicationContext.getBean("userDAO");
        userDAO.say();
    }
    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDAO customerDAO = (CustomerDAO)     applicationContext.getBean("customerDAO");
        customerDAO.save();
    }
}
