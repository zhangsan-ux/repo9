package com.itheima.test;

import Util.Util;
import com.itheima.po.Customer;
import com.itheima.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Create By cgc6868 on 2019/10/5
 */
public class MybatisTest {
    /*
    * 根据客户编号查询信息
    * */
    @Test
    public void findCustomerByIdTest() throws Exception {
        /*
        * 读取配置文件
        * */
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        /*
        * 根据配置文件构建sqlSessionFactory
        * */
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        /*
        * 通过SqlSessionFactory创建SqlSession
        * */
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /*
        * 通过SqlSession执行映射文件中定义的SQL，并返回映射结果
        * */
        Customer customer = sqlSession.selectOne("com.itheima.mapper"+".CustomerMapper.findCustomerById",1);
        /*
        * 打印输出结果
        * */
        System.out.println(customer.toString());
        /*
        * 关闭SqlSession
        *
        * */
              sqlSession.close();
    }
    /*
    * 根据客户名称来模糊查询客户信息
    * */
    @Test
    public void findCustomerByName() throws Exception {

        Util util = new Util();
           SqlSession sqlSession= util.util();
        /*
        * Sql执行映射文件中定义的SQL，并返回映射结果
        * */

        List<Customer> customers = sqlSession.selectList("com.itheima.mapper"+".CustomerMapper.findCustomerByName","j");
        for(Customer  customer   : customers) {
            System.out.println(customer);
        }
            /*
            * 关闭SqlSession
            * */
            sqlSession.close();
    }
    @Test
    public void addCustomer() throws IOException {
        Util util = new Util();
        SqlSession sqlSession= util.util();
        /*
        *4 SqlSession执行添加操作
        * */
        /*
        * 4.1创建Customer对象，添加属性
        * */
        Customer customer = new Customer();
        customer.setUsername("rose");
        customer.setJobs("student");
        customer.setPhone("13333533092");
        /*
        * 执行SqLSession 的插入方法，返回SQL语句影响的行数
        * */
        int  row = sqlSession.insert("com.itheima.mapper.CustomerMapper.addCustomer",customer);
        System.out.println(customer.getId());
        if(row>0){
            System.out.println("你成功的插入"+row+"行");
        }else {
            System.out.println("插入失败");
        }
       sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateCustomer() throws IOException {
        Util util = new Util();
        SqlSession sqlSession= util.util();
        Customer customer = new Customer();
        customer.setId(5);
        customer.setUsername("rose");
        customer.setJobs("teacher");
        customer.setPhone("17879552420");
        int row = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomer", customer);
        if(row>0){
            System.out.println("你成功的更新"+row+"行");
        }else {
            System.out.println("更新失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteCustomer() throws IOException {
        Util util = new Util();
        SqlSession sqlSession= util.util();
        int row = sqlSession.delete("com.itheima.mapper.CustomerMapper.deleteCustomer",5);
        if(row>0){
            System.out.println("你成功的删除"+row+"行");
        }else {
            System.out.println("删除失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void findAllUser() throws IOException {
        Util util = new Util();
        SqlSession sqlSession= util.util();
        List<User> list = sqlSession.selectList("com.itheima.mapper.UserMapper.findAllUser");
        for(User user :list){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
