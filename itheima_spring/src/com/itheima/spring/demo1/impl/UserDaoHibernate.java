package com.itheima.spring.demo1.impl;

import com.itheima.spring.demo1.dao.UserDAO;

/**
 * Create By cgc6868 on 2019/9/20
 */
public class UserDaoHibernate implements UserDAO {
     public void say(){
         System.out.println("UserDAOHibernate 执行了");
     }
}
