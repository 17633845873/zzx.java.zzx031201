package com.lening.controller;

import com.lening.entity.UserBean;
import com.lening.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2021/3/10 10:51
 * 作者：李增强
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("/getUserList")
    @ResponseBody
    public List<UserBean> getUserList(){
        return userService.getUserList();
    }
}
