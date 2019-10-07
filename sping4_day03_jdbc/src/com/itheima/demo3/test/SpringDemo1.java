package com.itheima.demo3.test;

import com.itheima.demo3.dao.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 基于注解方式声明事务
 * 测试转账的环境
 *
 * Create By cgc6868 on 2019/9/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx3.xml")
public class SpringDemo1 {
    @Resource(name ="accountService")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("小明","汪国甜",2000d);
    }

}
