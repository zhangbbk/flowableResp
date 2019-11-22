package com.ultimatech.controller;

import com.ultimatech.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author zhangbbk
 * @date 2019/11/14 8:41
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public boolean login(HttpSession session, @RequestBody com.ultimatech.entity.User user) {
        String userName = user.getUserName();
        String password = user.getPassword();
        boolean login = userService.login(userName, password);
        if (login) {
            session.setAttribute("userName", userName);
            return true;
        }
        return false;
    }

    @GetMapping("/exit")
    public String exit(HttpSession session) {
        session.removeAttribute("userName");
        return "login";
    }
}
