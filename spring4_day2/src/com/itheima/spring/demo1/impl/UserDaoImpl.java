package com.itheima.spring.demo1.impl;

import com.itheima.spring.demo1.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *用户实现类
 *
 * Create By cgc6868 on 2019/9/22
 */
//@Component("userDao")//相当于<bean id= "userDao" class = "com.itheima.spring .demo1.UserDaoImpl" >
    @Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("奥特曼")
    private  String name;

    public void save(){
        System.out.println("用户Dao 保存的方法执行了" +name);

    }
}

