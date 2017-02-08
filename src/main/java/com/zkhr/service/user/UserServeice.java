package com.zkhr.service.user;

import com.zkhr.dao.user.UserDao;
import com.zkhr.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@Service
public class UserServeice {

    @Autowired
    private UserDao userDao;

    public User saveUser(User user){
        return userDao.save(user);
    }
}
