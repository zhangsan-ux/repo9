package com.itheima.jdbc.demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;
import java.sql.DriverManager;

/**
 * JDBC模板的使用
 * Create By cgc6868 on 2019/9/26
 */

public class JdbcDemo1 {
    @Test
    /*
    * JDBC模板的使用类似Dbutils
    * */
    public void demo1(){
        /*
        * 创建连接池
        * */
        DriverManagerDataSource dateSource = new DriverManagerDataSource();
      dateSource.setDriverClassName("com.mysql.jdbc.Driver");
      dateSource.setUrl("jdbc:mysql:///spring4_day03");
      dateSource.setUsername("root");
      dateSource.setPassword("123456");


        /*
        * 创建jdbc模板
        * */
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dateSource);
        jdbcTemplate.update("insert into account values (null,?,?)","小明",10000);
    }
}
