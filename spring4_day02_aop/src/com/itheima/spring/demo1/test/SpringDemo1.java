package com.itheima.spring.demo1.test;

import com.itheima.spring.demo1.JdkProxy;
import com.itheima.spring.demo1.dao.UserDao;
import com.itheima.spring.demo1.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import javax.sql.rowset.JdbcRowSet;

/**
 * Create By cgc6868 on 2019/9/22
 */
public class SpringDemo1 {
    @Test
    public  void demo1(){
        UserDao userDao  = new UserDaoImpl();
        //创建代理
        UserDao proxy= new JdkProxy(userDao).createProxy();
        proxy.delete();
        proxy.find();
        proxy.save();
        proxy.update();
        }
}
