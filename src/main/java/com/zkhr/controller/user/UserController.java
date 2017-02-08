package com.zkhr.controller.user;

import com.zkhr.model.user.User;
import com.zkhr.model.user.UserInfo;
import com.zkhr.service.user.UserInfoService;
import com.zkhr.service.user.UserServeice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@RestController
public class UserController {

    @Autowired
    private UserServeice userServeice;

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping("/saveUser")
    public String saveUser(){

        User user = new User();
        user.setUsername("张三");
        user.setPassword("123435");

        User resultUser = userServeice.saveUser(user);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(user.getId());
        userInfo.setAddress("Hello");

        userInfoService.saveUserInfo(userInfo);


        String result =  "";
        System.out.print(result);
        return result;
    }
}
