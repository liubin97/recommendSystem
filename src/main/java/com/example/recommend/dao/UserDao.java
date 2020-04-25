package com.example.recommend.dao;


import com.example.recommend.entity.User;
import com.example.recommend.entity.UserInfo ;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    List<UserInfo> selectUsers();
    List<User> selcetAllUser();
    int checkOpenid(String openid);//判断openid是否存在

    void insertUserInfo(UserInfo userInfo);
    String getUserType(String openid);
    UserInfo getUserInfoByOpenid(String openid);
    void updateUserInfo(UserInfo userInfo);


}
