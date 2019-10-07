package com.itheima.spring.demo4;

/**
 * Create By cgc6868 on 2019/9/20
 */
public class Employee {
    private  String name;
    private  Car2   car2;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar2(Car2 car2) {
        this.car2 = car2;
    }
    public String toString(){
        return "Employee [ "+name+","+car2+"]";
    }
}


