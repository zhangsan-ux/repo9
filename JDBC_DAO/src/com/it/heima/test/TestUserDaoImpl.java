package com.it.heima.test;

import com.it.heima.dao.UserDao;
import com.it.heima.dao.impl.UserDaoImpl;
import org.junit.Test;

/**
 * Create By cgc6868 on 2019/9/19
 */
public class TestUserDaoImpl {
    @Test
     public void testFindAll(){
         UserDao dao = new UserDaoImpl();
         dao.findAll();
     }
     @Test
     public void testLogin(){
        UserDao  dao = new UserDaoImpl();
        dao.login("admin","10086");
     }
     @Test
     public void testInsert(){
        UserDao dao = new UserDaoImpl();
        dao.insert("alibaba","123");
     }
     @Test
     public void testUpdate(){
        UserDao dao = new UserDaoImpl();
        dao.update(4,"10017");
     }
     @Test
     public void testDelete(){
        UserDao dao  = new UserDaoImpl();
        dao.delete(5);
     }
}
