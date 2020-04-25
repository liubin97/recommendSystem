package com.example.recommend.service;

import com.example.recommend.entity.Users;

import java.util.Map;

public interface UsersService {
    void addUser(Users user);

    Users selectByUserName(String username);

    Map<String,Object> register(String username,String password,String prefer);

    Map<String,Object> logIn(String username,String password);

}
