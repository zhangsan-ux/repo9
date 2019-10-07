package com.itheima.tx.demo1.impl;

import com.itheima.tx.demo1.dao.AccountDao;
import com.itheima.tx.demo1.dao.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账业务层的实现类
 * Create By cgc6868 on 2019/9/27
 */
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
    /*
    * 注入事务管理模板
    * */
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void transfer(final   String from, final String to, final Double money){
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(to,money);
               //int i =1/0;
                accountDao.inMoney(from,money);
            }
        });

    }



}
