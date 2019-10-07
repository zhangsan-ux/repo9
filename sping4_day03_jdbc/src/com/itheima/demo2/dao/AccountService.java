package com.itheima.demo2.dao;

/**
 * 转账业务层的接口
 * Create By cgc6868 on 2019/9/27
 */
public interface AccountService {
    void transfer(String from, String to, Double money);

}
