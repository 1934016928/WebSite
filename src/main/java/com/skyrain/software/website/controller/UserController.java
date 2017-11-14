package com.skyrain.software.website.controller;

import com.skyrain.software.website.entity.UserBean;
import com.skyrain.software.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户相关部分控制器
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/index")
    @ResponseBody
    public void regUser(@RequestBody UserBean userBean) {
        userService.addUser(userBean);
        System.out.println("ADD SUCCESS!");
    }
}
