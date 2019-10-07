package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By cgc6868 on 2019/9/14
 */
public class TestDI {
    public static void main(String[] args){
        //初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       //通过容器获取UserService实例
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.say();

    }
}
