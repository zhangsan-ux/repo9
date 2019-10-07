package com.itheima.demo3.impl;

import com.itheima.demo3.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 转账DAO的实现类
 * Create By cgc6868 on 2019/9/27
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    @Override
    public void outMoney(String from, Double money) {
      this.getJdbcTemplate().update("update account set money = money -? where name = ?",money,from);
    }

    @Override
    public void inMoney(String to, Double money) {
        this.getJdbcTemplate().update("update account set money = money +? where name = ?",money,to);
    }


}
