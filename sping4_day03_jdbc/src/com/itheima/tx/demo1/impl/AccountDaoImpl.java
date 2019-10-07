package com.itheima.tx.demo1.impl;

import com.itheima.tx.demo1.dao.AccountDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.awt.*;

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
