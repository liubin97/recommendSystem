package com.example.recommend.service.impl;

import com.example.recommend.dao.AdminUserDao;
import com.example.recommend.service.LoginService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class AdminLoginServiceImplTest {
    @Autowired
    private LoginService loginService;
    @Test
    void checkAccount() {
        boolean b = loginService.checkAccount("1","1");
        assertEquals(true,b);
    }
}
