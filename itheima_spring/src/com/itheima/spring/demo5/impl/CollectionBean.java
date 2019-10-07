package com.itheima.spring.demo5.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Create By cgc6868 on 2019/9/21
 */
public class CollectionBean {
    private String[] arr;
    private  List <String> list;
    private Set<String> set;
    private Map <String,String> map;

    public void setArr(String[] arr) {
        this.arr = arr;
    }
    public String toString (){
        return "ConnectionBean [ arr =  "+ Arrays.toString(arr)+","+list+","+set+","+map+"]";
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
