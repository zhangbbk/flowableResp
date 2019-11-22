package com.ultimatech.controller;

import com.ultimatech.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangbbk
 * @date 2019/11/14 10:22
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/getAllUser")
    public Object getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/getAllGroup")
    public Object getAllGroup() {
        return userService.getAllGroup();
    }

    @GetMapping("/getUserGroup")
    public Object getUserGroup(String groupId) {
        return userService.getUserGroup(groupId);
    }

    @PostMapping("/addUser")
    public Object addUser(@RequestBody com.ultimatech.entity.User user) {
        return userService.addUser(user);
    }
    @PostMapping("/addUserGroup")
    public Object addUserGroup(@RequestBody com.ultimatech.entity.User user) {

        return userService.addUser(user);
    }

}
