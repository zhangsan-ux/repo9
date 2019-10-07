package com.itheima.spring.demo4;

/**
 * Create By cgc6868 on 2019/9/20
 */
public class Car2 {
    private String name;
    private Double price;


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String toString (){
        return "Car2  [ "+name+","+price+"]";
    }
}
