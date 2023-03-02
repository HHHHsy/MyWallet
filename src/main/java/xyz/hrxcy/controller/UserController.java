package xyz.hrxcy.controller;

import org.springframework.web.bind.annotation.*;
import xyz.hrxcy.pojo.User;
import xyz.hrxcy.pojo.Wallet;
import xyz.hrxcy.service.WalletService;
import xyz.hrxcy.service.impl.UserServiceImpl;
import xyz.hrxcy.service.impl.WalletServiceImpl;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @Resource
    private WalletServiceImpl walletService;

    //登录账户
    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userService.Login(user);
    }

    //查看钱包
    @GetMapping("/user/{id}")
    public Wallet queryMoney(@PathVariable("id") String id){
        System.out.println(id);
        System.out.println(walletService.queryMoney(id));
        return walletService.queryMoney(id);
    }

    //用户消费
    //用户退款
    //用户查询金额变动明细
}
