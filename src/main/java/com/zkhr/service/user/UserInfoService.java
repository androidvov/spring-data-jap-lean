package com.zkhr.service.user;

import com.zkhr.dao.user.UserInfoDao;
import com.zkhr.model.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    public UserInfo saveUserInfo(UserInfo userInfo){
        return userInfoDao.save(userInfo);
    }
}
