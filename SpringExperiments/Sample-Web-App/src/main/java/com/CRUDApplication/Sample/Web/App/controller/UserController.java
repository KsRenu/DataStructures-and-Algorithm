package com.CRUDApplication.Sample.Web.App.controller;


import com.CRUDApplication.Sample.Web.App.entity.User;
import com.CRUDApplication.Sample.Web.App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return " successfully added user";
    }
}
