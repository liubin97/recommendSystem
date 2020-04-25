package com.example.recommend.dao;

import com.example.recommend.entity.Users;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class UsersDaoTest {
    @Autowired
    UsersDao usersDao;
    @Test
    void addUser() {
        Random random =new Random();
        for(int i=0;i<10;i++){
            Users user = new Users();
            user.setAge(random.nextInt());
            user.setGender("male");
            user.setZip(random.nextInt());
            user.setOccupation(1);
            user.setUsername(String.format("username%d",random.nextInt()));
            user.setPassword(String.format("passwordis%d",random.nextInt()));
            user.setPrefer("action");
            usersDao.addUser(user);
        }


    }

    @Test
    void selectByUserName() {
        Users users = new Users();
        users=usersDao.selectByUserName("1");
        System.out.println(users.getGender());
    }

    @Test
    void updatePassword() {
    }

    @Test
    void deleteByUserName() {
        usersDao.deleteByUserName(null);
    }
}