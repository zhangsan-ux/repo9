package com.itheima.spring.demo1.impl;

import com.itheima.spring.demo1.dao.UserDao;
import com.itheima.spring.demo1.dao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create By cgc6868 on 2019/9/22
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

 /* @Autowired
  @Qualifier(value="userDao")*/
 @Resource(name="userDao")
  private UserDao userDao;
    public  void save(){
        userDao.save();
        System.out.println("UserService 执行了");
    }

}
