package com.itheima.spring.demo3;

import javax.annotation.Resource;

/**
 * Create By cgc6868 on 2019/9/22
 */


public class ProductService {
    @Resource(name ="productDao"  )
    private   ProductDao productDao;
    @Resource(name ="oderDao"  )
    private  OrderDao orderDao;
/*
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }*/
    public void save(){
        System.out.println("ProductService 的save方法执行了");
        productDao.save();
        orderDao.save();

    }
}
