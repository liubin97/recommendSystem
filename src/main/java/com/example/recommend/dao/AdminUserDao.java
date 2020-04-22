package com.example.recommend.dao;

import com.example.recommend.entity.AdminUser;
import com.example.recommend.entity.Users;

import java.util.List;

public interface AdminUserDao {
    List<AdminUser> getAdminUserByPass(String adminname, String adminpassword);
    void deleteUserById(String userid);
    List<Users> getAllUserList();
}
