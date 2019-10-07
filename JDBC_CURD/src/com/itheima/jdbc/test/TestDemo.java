package com.itheima.jdbc.test;

import com.itheima.jdbc.util.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Create By cgc6868 on 2019/9/19
 */
public class TestDemo {
    @Test
    public void testQuery(){

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        //查询
        //1，获取连接对象
        try {
            connection = JDBCUtil.getConnection();
            //2,连接对象，得到Statement
            statement = connection.createStatement();
            //3,执行sqL 语句，返回Resultset
            String sql = "select * from t_stu";
            resultset = statement.executeQuery(sql);

            while(resultset.next()){
                Integer id   = resultset.getInt("id");
                String name  = resultset.getString("name");
                Integer age   = resultset.getInt("age");
                System.out.println("id =="+id + " ,name="+name +",age=" +age );
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(connection,statement, resultset);
        }
    }
    @Test
    public void testInsert(){

          Connection connection = null;
          Statement  statement = null;
        try {
             connection = JDBCUtil.getConnection();

           statement = connection.createStatement();

            String sql = "insert into  t_stu value (null,'alibab',15)";
            int result  = statement.executeUpdate(sql);
            if(result >0) {
                System.out.println("插入了 " + result + "行");
            }else {
                System.out.println("插入失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(connection ,statement);
        }


    }
    @Test
    public void testDelete(){

        Connection connection = null;
        Statement  statement = null;
        try {
            connection = JDBCUtil.getConnection();

            statement = connection.createStatement();

            String sql = "delete from t_stu where name = 'alibab'";

            int result  = statement.executeUpdate(sql);
            if(result >0) {
                System.out.println("删除了 " + result + "行");
            }else {
                System.out.println("删除失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(connection ,statement);
        }


    }
    @Test
    public void testUpdate(){

        Connection connection = null;
        Statement  statement = null;
        try {
            connection = JDBCUtil.getConnection();

            statement = connection.createStatement();

            String sql = "update t_stu set age = 40 WHERE name = 'lisi' ";

            int result  = statement.executeUpdate(sql);
            if(result >0) {
                System.out.println("跟新了 " + result + "行");
            }else {
                System.out.println("更新失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(connection ,statement);
        }


    }

}

