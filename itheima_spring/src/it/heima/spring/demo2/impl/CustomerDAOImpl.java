package it.heima.spring.demo2.impl;

import it.heima.spring.demo2.dao.CustomerDAO;

/**
 * Create By cgc6868 on 2019/9/20
 */
public class CustomerDAOImpl implements CustomerDAO {
    public void setup(){
        System.out.println("CustomerDAOImpl 被初始化了");
    }

    public void save(){
        System.out.println("CustomerDAO  执行了......");
    }
    public void destroy(){
        System.out.println("CustomerDAOImpl 被销毁了");
    }
}
