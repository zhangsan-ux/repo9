package com.itheima.spring.demo5.test;

import com.itheima.spring.demo5.impl.CollectionBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By cgc6868 on 2019/9/21
 */
public class SpringDemo5 {
    @Test
    public void testCollectionBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
    }


}
