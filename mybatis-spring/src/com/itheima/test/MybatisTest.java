package com.itheima.test;

import com.itheima.Util.MybatisUtil;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Create By cgc6868 on 2019/10/6
 */
public class MybatisTest {
    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
         SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
         SqlSession sqlSession = sqlSessionFactory.openSession();
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer= customerMapper.findCustomerById(1);
        System.out.println(customer);


    }
}
