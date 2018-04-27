package com.test.controller;

import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author aizongbin
 * @date 2018/4/27 8:27
 */
@Controller
@SessionAttributes("user")
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName){
        //动态跳转页面
        return formName;
    }

    /**
     * 登陆
     * @param user 登陆者信息
     * @return
     */
    @RequestMapping("/login")
    public String findAllUser(User user, Model model){
        User user1=userService.selectUserById(user.getId());
        return "success";
    }
}
