package com.itheima.ioc;

/**
 * Create By cgc6868 on 2019/9/14
 */
public class UserServiceImpl implements  UserService {
    //声明UserDao 的属性
    private   UserDao userDao;
    //添加UserDao 的属性的setter方法，用于实现依赖注入
    public void setUserDao(UserDao userDao){
        this.userDao= userDao;
    }
    //实现接口中的方法
    public  void say(){
        //调用userDao 的say()方法，并执行输出语句
        this.userDao.say();
        System.out.println("userService say hello Word !");
    }
}
