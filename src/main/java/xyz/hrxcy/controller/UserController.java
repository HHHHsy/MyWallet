package xyz.hrxcy.controller;

import org.springframework.web.bind.annotation.*;
import xyz.hrxcy.pojo.Details;
import xyz.hrxcy.pojo.User;
import xyz.hrxcy.pojo.Wallet;
import xyz.hrxcy.service.impl.UserServiceImpl;
import xyz.hrxcy.service.impl.WalletServiceImpl;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @Resource
    private WalletServiceImpl walletService;

    /**
     * 登录账户
     * @param user 账号密码
     * @return
     */
    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userService.Login(user);
    }

    /**
     * 查看钱包
     * @param id 用户id
     * @return
     */
    @GetMapping("/wallet/{id}")
    public Map<String, Object> queryMoney(@PathVariable("id") String id){
        return walletService.queryMoney(id);
    }

    /**
     * 钱包支出/收入
     * @param userId    用户id
     * @param total     支出或收入的金额
     * @param remark    金额改变的原因，例如购物、充值
     * @param status    标记支出或收入
     * @return
     */
    @PutMapping("/wallet/{userId}/{total}/{remark}/{status}")
    public Wallet updateUserWallet(@PathVariable String userId,
                                   @PathVariable BigDecimal total,
                                   @PathVariable String remark,
                                   @PathVariable int status){
        return walletService.changeWallet(userId, total, remark,status);
    }

    /**
     * 用户查询钱包金额变动明细
     * @param userId 用户id
     * @return
     */
    @GetMapping("/wallet/list/{userId}")
    public List<Details> queryDetailsByUserId(@PathVariable String userId){
        System.out.println("userId = "  + userId);
        return walletService.getAllWalletChange(userId);
    }
}
