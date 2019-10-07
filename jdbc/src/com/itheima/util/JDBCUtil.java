package com.itheima.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Create By cgc6868 on 2019/9/18
 */
public class JDBCUtil {

     static String driverClass = null;
    static String  url = null;
    static String  user = null;
    static String  password = null;

    /*
    * 获取连接对象
    * */
    static {
        try{
        //1，创建一个属性配置文件
        Properties properties = new Properties();
       InputStream is = new FileInputStream("jdbc.properties");
       //使用类加载器，去读取Src底下的资源文件
            //InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        //导入输入流。

        properties.load(is);
        //读取属性
            driverClass =properties.getProperty("driverClass");
            url =properties.getProperty("url");
            user =properties.getProperty("user");
            password =properties.getProperty("password");


    }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static  Connection getConnection () throws ClassNotFoundException, SQLException {
        Connection connection= null;
        //1,注册驱动
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName(driverClass);
        //2,创建连接 connection  ;
       connection = DriverManager.getConnection(url,user,password);

        return  connection;
    }


    public  static void release(Connection connection,Statement statement,ResultSet resultset){
        closeResultSet(resultset);
        closeStatement(statement);
        closeConnection(connection);
    }
    private static void closeResultSet(ResultSet resultset) {
        try {
            if (resultset != null) {
                resultset.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultset = null;
        }

    }

    private static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement = null;
        }
    }
        private static void closeConnection(Connection connection){
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection = null;
            }

        }


    }








