package com.qf.controller;


import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/login.do")
    public String login(User user, HttpServletRequest httpServletRequest) {
        List<User> users = userService.findUser(user);
        httpServletRequest.setAttribute("user", users);
        return "login";
    }

    @RequestMapping("/delete.do")
    public String delete(@RequestParam List<Integer> item) {
        userService.deleteUser(item);
        return "login";
    }

}
