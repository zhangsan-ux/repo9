package com.itheima.jdbc.test;

import com.itheima.jdbc.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Create By cgc6868 on 2019/9/19
 */
public class MainTest {
    public static void main(String[] args) {
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

}
