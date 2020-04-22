package com.example.recommend.service;

import com.example.recommend.entity.Users;

import java.sql.SQLException;
import java.util.List;

public interface AdminUserService {

    /**
     * 根据用户id删除用户
     * @param userid
     */
    void deleteUserById(String userid);

    /**
     * 查询所有用户列表
     * @return
     */
    List<Users> getAllUserList();
}
