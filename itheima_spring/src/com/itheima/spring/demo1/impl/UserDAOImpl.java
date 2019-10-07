package com.itheima.spring.demo1.impl;

import com.itheima.spring.demo1.dao.UserDAO;

/**
 * 用户管理业务层
 * Create By cgc6868 on 2019/9/20
 */
public class UserDAOImpl implements UserDAO {
    private String  name;
    public void setName(String name){
        this.name = name;
    }

    public void say(){
        System.out.println("UserDAO 执行了"+name);
    }
}
