package com.example.recommend.service.impl;

import com.example.recommend.dao.UserDao ;
import com.example.recommend.entity.UserInfo ;
import com.example.recommend.service.UserService ;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public List<UserInfo> getUsers() {
        return userDao.selectUsers();
    }

    @Override
    public int checkOpenid(String openid) {
        if(userDao.checkOpenid(openid)>0){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public void insertUserInfo(JSONObject jsonObject) {
        UserInfo u = new UserInfo();

        userDao.insertUserInfo(u);
    }

    @Override
    public String getUserType(String openid) {
        String userType = userDao.getUserType(openid);
        return userType;
    }

    @Override
    public UserInfo getUserInfoByOpenid(String openid) {
        UserInfo u = userDao.getUserInfoByOpenid(openid);
        return u;
    }

    @Override
    public void updateUserInfo(JSONObject jsonObject) {
        UserInfo u = new UserInfo();

        userDao.updateUserInfo(u);
    }


}
