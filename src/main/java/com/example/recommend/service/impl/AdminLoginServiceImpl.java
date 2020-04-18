package com.example.recommend.service.impl;

import com.example.recommend.dao.AdminUserDao;
import com.example.recommend.entity.AdminUser;
import com.example.recommend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminLoginServiceImpl implements LoginService {
    @Autowired
    private AdminUserDao adminUserDao;

    @Override
    public boolean checkAccount(String username, String password) {
        List<AdminUser> adminUsers = adminUserDao.getAdminUserByPass(username,password);
        return adminUsers.size() > 0;
    }
}
