package com.atguigu.controller;

import com.atguigu.bean.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        return userService.findUsers();
    }

    @RequestMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }
    @RequestMapping("/saveUser")
    public void saveUser(User user) {
        userService.saveUser(user);
    }
    @RequestMapping("/updateUser")
    public void updateUser(User user) {
        userService.updateUser(user);
    }
    @RequestMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable("id")  Integer id) {
        userService.deleteUserById(id);
    }

}
