package com.example.recommend.service;

import java.sql.SQLException;

public interface AdminUserService {

    /**
     * 根据用户id删除用户
     * @param userid
     */
    void deleteUserById(String userid);
}
