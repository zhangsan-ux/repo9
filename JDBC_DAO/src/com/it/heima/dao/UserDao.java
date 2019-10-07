package com.it.heima.dao;

/**
 * 定义操作数据库的方法
 * Create By cgc6868 on 2019/9/19
 */
public interface UserDao {

    /*
    *插入数据
    * */
    void insert(String username,String password);

    /*
    *查询所有
    * */
    void findAll();
    /*
    *登录方法
    * */
    void login(String username,String password);
    /*
    * 更新方法
    * */
    void update(Integer id ,String password);
    /*
    * 删除方法
    * */
    void delete(Integer id);
}
