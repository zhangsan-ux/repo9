package com.itheima.spring.demo4;

/**
 * Create By cgc6868 on 2019/9/20
 */
public class Car {
    private String  name;
    private  Double price;

    public Car(String name,Double price){
        super();
        this.name= name;
        this.price = price;
    }
    public String  toString(){
        return "Car [ name ="+name+",price = "+price+"]";
    }
}
