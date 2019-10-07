package com.itheima.spring.demo1;

import com.itheima.spring.demo1.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理 对UserDao产生代理
 * Create By cgc6868 on 2019/9/22
 */
public class JdkProxy implements InvocationHandler {
    /*
    *将被增强的对象传递到代理中
    * */
    private UserDao userDao;
    public JdkProxy(UserDao userDao){
        this.userDao = userDao;
    }
    public UserDao createProxy() {
         UserDao userDaoProxy =(UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return  userDaoProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //判断方法名是不是save；
        if("save".equals(method.getName())){
            //增强
            System.out.println("权限校验=======================");
            return  method.invoke(userDao,args);
        }
        return  method.invoke(userDao,args);
    }
}
