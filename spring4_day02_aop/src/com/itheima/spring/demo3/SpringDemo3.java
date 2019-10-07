package com.itheima.spring.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * AOP 的入门
 * Create By cgc6868 on 2019/9/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {
    @Resource(name="productDao")
    private  ProductDao productDao;

    @Test
    public void demo1(){
        productDao.save();
        productDao.delete();
        productDao.find();
        productDao.update();


    }

}
