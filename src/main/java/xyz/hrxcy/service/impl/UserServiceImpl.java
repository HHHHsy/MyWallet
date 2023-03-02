package xyz.hrxcy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.springframework.stereotype.Service;
import xyz.hrxcy.mapper.UserMapper;
import xyz.hrxcy.pojo.User;
import xyz.hrxcy.service.UserService;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User Login(User user) {
        System.out.println(user);
        QueryWrapper<User> queryUser = new QueryWrapper<>();
        queryUser.eq("name",user.getName()).eq("password",user.getPassword());
        User account = userMapper.selectOne(queryUser);
        System.out.println("account " + account);
        if (Objects.isNull(account)){
            return null;
        }
        return account;
    }
}
