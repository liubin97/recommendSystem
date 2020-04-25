package com.example.recommend.dao;

import com.example.recommend.entity.AdminUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class AdminUserDaoTest {
    @Autowired
    private AdminUserDao userDao;

    @Test
    void getAdminUserByPass() {
        String username = "1";
        String password = "1";
        List<AdminUser> users = userDao.getAdminUserByPass(username,password);
        System.out.println(users.size());
        assertEquals(1,users.size());


    }
}
