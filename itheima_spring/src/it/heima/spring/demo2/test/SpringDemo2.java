package it.heima.spring.demo2.test;

import it.heima.spring.demo2.dao.CustomerDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By cgc6868 on 2019/9/20
 */

public class SpringDemo2 {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDAO     customerDAO = (CustomerDAO) applicationContext.getBean("customerDAO");
        customerDAO.save();
    }
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDAO     customerDAO1 = (CustomerDAO) applicationContext.getBean("customerDAO");
        System.out.println(customerDAO1);

        CustomerDAO     customerDAO2 = (CustomerDAO) applicationContext.getBean("customerDAO");
        System.out.println(customerDAO2);
        System.out.println(customerDAO1 ==customerDAO2);


    }

}
