package xyz.hrxcy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.hrxcy.pojo.User;
import xyz.hrxcy.service.impl.UserServiceImpl;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @PostMapping("/login")
    public User login(@RequestBody User user){

        return userService.Login(user);
    }
}
