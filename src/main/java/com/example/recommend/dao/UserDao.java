package com.example.recommend.dao;


import com.example.recommend.entity.UserInfo ;
import java.util.List;

public interface UserDao {
    List<UserInfo> selectUsers();
    int checkOpenid(String openid);//判断openid是否存在
    void insertUserInfo(UserInfo userInfo);
    String getUserType(String openid);
    UserInfo getUserInfoByOpenid(String openid);
    void updateUserInfo(UserInfo userInfo);
}
