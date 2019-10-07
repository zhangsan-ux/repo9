package com.itheima.jdbc.demo1;

import com.itheima.jdbc.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static javafx.scene.input.KeyCode.M;

/**
 * Create By cgc6868 on 2019/9/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2 {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
/*
* 保存操作
* */
    public void demo1(){
        jdbcTemplate.update("insert into account values (null,?,?)","汪国甜甜",20000);
    }
    /*
    * 修改操作
    * */
    @Test
    public void demo2(){
        jdbcTemplate.update("update account set name= ?,money=? where id=?","哆啦A梦",5000,2);
    }
    /*
    * 删除操作
    * */
    @Test
    public void demo3(){
        jdbcTemplate.update("delete from account where id = ?",4);
    }
    /*
    * 查询某个属性
    * */
    @Test
    public void demo4(){
         Integer money =jdbcTemplate.queryForObject("select money from account where id = ?",Integer.class,3);
        System.out.println(money);
    }
    /*
    *查询个数
    * */
    @Test
    public void demo5(){
        Long count =jdbcTemplate.queryForObject("select count(*) from account ",Long.class);
        System.out.println(count);
    }
    /*
    *封装到一个对象当中
    * */
    @Test
    public void demo6(){
       Account account = jdbcTemplate.queryForObject("select * from account where id = ?",new MyRowMapper(),2);
        System.out.println(account);
    }
    class MyRowMapper implements RowMapper<Account>{

        public Account mapRow(ResultSet rs, int rowNumber) throws SQLException {
        Account account = new Account();
        account.setId(rs.getInt("id"));
        account.setName(rs.getString("name"));
        account.setMoney(rs.getDouble("money"));
            return account;
        }
    }
    /*
    *查询多条记录
     */
    @Test
    public void demo7(){
        List<Account> list=jdbcTemplate.query("select * from account ",new MyRowMapper());
        for(Account account :list){
            System.out.println(account);

        }
    }

}
