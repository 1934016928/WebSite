package com.skyrain.software.website.controller;

import com.skyrain.software.website.entity.result.Result;
import com.skyrain.software.website.service.UserService;
import com.skyrain.software.website.state.State;
import com.skyrain.software.website.utils.RedisUtil;
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
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(method = RequestMethod.POST, value = "/index")
    @ResponseBody
    public Result regUser(@RequestBody String json) {
        redisUtil.set("json", json);
        System.out.println("JSON=" + json + " ADD SUCCESS!");
        System.out.println("SAVE TO REDIS DATA IS:" + redisUtil.get("json"));
        redisUtil.remove("json");
        System.out.println("SAVE TO REDIS DATA IS:" + redisUtil.get("json"));
        return new Result(State.Code.REQUEST_CODE_200, State.Msg.REQUEST_MSG_200, System.currentTimeMillis(), null, null);
    }
}
