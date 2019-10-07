package com.itheima.spring.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Create By cgc6868 on 2019/9/22
 */
@Service("customerService")
@Scope("prototype")
public class CustomerService {
     @PostConstruct //相当于init()方法
    public void init(){
        System.out.println("CustomerService被初始化了");
    }
    public void save(){
        System.out.println("Service 的save方法执行了");
    }
    @PreDestroy //相当于destroy()方法
    public void destroy(){
        System.out.println("CustomerService被销毁了");
    }
}
