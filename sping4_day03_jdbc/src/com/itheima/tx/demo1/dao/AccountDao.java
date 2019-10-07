package com.itheima.tx.demo1.dao;

/**
 * 转账的业务层
 * Create By cgc6868 on 2019/9/27
 */
public interface AccountDao {
    void outMoney(String from,Double Money);
    void inMoney(String to,Double Money);

}
