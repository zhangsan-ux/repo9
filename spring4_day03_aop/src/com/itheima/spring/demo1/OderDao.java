package com.itheima.spring.demo1;

/**
 * Create By cgc6868 on 2019/9/25
 */
public class OderDao {
    public void save(){
        System.out.println("保存订单......");
    }
    public String update(){
        System.out.println("修改订单.....");
        return "你回到";
    }
    String delete(){
        System.out.println("删除订单.....");
        return "年后";
    }
    public void find(){
        System.out.println("查询订单.......");
    }


}
