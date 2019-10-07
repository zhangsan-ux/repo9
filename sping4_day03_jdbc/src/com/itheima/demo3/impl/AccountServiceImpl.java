package com.itheima.demo3.impl;

import com.itheima.demo3.dao.AccountDao;
import com.itheima.demo3.dao.AccountService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 转账业务层的实现类
 * Create By cgc6868 on 2019/9/27
 */
@Transactional
public class AccountServiceImpl implements AccountService {
    /*
     * from ：转出账号
     * to: 转入账号
     * money:转账金额
     * */
    /*
     *注入DAO
     * */
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;

    }

    public void transfer( String from,  String to, Double money)

        {

            accountDao.inMoney(from, money);
           int i = 1 / 0;
            accountDao.outMoney(to, money);
        }

}
