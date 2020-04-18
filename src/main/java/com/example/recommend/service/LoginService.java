package com.example.recommend.service;

public interface LoginService {
    /**
     * 校验账号密码正确性
     * @param username
     * @param password
     * @return
     */
    boolean checkAccount(String username, String password);
}
