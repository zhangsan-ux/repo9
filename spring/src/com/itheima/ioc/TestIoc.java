package com.itheima.ioc;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By cgc6868 on 2019/9/14
 */
public class TestIoc {
    public static void main(String[] args){
        //初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取useDao 的实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //调用实例中的say()方法
        userDao.say();

    }
}
