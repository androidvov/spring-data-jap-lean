package com.zkhr.controller.rest;

import com.alibaba.fastjson.JSON;
import com.zkhr.model.user.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoshuai on 2017/2/10.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/getUsers",produces="application/json")
    public String testJson(){


        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        return JSON.toJSONString(user);
    }

    @RequestMapping(value = "/getUserWithParam",produces="application/json",method = RequestMethod.POST)
    public String testJson2(@RequestBody String name){


        User user = new User();
        user.setUsername(name);
        user.setPassword("123");
        return JSON.toJSONString(user);
    }






}
