package com.itheima.spring.demo1.impl;

import com.itheima.spring.demo1.dao.UserDao;

/**
 * Create By cgc6868 on 2019/9/22
 */
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("保存用户........");
    }
    public  void  delete(){
        System.out.println("删除用户");
    }
    public void find(){
        System.out.println("查找用户.....");
    }
    public void update(){
        System.out.println("更新用户.....");
    }
}
