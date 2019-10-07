package com.it.heima.dao.impl;

import com.it.heima.dao.UserDao;
import com.it.heima.util.JDBCUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.sql.*;

/**
 * Create By cgc6868 on 2019/9/19
 */
public class UserDaoImpl implements UserDao {
    @Test
    public void findAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            //1,创建连接对象
            connection = JDBCUtil.getConnection();
            //2,获取Statement对象
            statement = connection.createStatement();
            //3,执行SQL语句，返回查询结果
            String sql = "select * from t_user";
            resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                Integer id = resultset.getInt("id");
                String user = resultset.getString("username");
                String password = resultset.getString("password");
                System.out.println("id =" + id + "  username =" + user + "   password =" + password);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(connection, statement, resultset);
        }
    }

    public void login(String username, String password) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            //1,创建连接对象
            connection = JDBCUtil.getConnection();
            //2,获取PreparedStatement对象
            String sql = "select * from t_user where username= ? and password = ?";
            PreparedStatement preparedstatement = connection.prepareStatement(sql);
            preparedstatement.setString(1, username);
            preparedstatement.setString(2, password);

            resultset = preparedstatement.executeQuery();
            if (resultset.next()) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(connection, statement, resultset);
        }

    }

    public void insert(String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into t_user values (null,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(connection, preparedStatement);
        }

    }

    public void update(Integer id, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update t_user set password =? where id = ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setInt(2, id);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(Integer id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "delete from t_user where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int result = preparedStatement.executeUpdate();
            if(result >0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(connection,preparedStatement);
        }


    }
}

