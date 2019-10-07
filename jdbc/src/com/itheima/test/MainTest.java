package com.itheima.test;

import com.itheima.util.JDBCUtil;

import java.sql.*;

/**
 * Create By cgc6868 on 2019/9/18
 */
public class MainTest {
    public static void main (String[] args){
        DriverManager driverManager = null;
        Statement statement = null;
        ResultSet resultset = null;
        Connection connection = null;

        try {
             connection=JDBCUtil.getConnection();
            //3,创建statement ,跟数据库打交道，一定需要这个对象；
            statement = connection.createStatement();
            //4，执行查询
            String sql;
            sql = "select * from t_stu";
             resultset =statement.executeQuery(sql);
            //5，遍历查询每一条记录
            while(resultset.next()){
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                int age = resultset.getInt("age");
                System.out.println("id" +id + "===name="+name +"===age="+age );
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(connection,statement,resultset);
        }
    }
}
