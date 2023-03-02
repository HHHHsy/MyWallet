package xyz.hrxcy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import xyz.hrxcy.mapper.WalletMapper;
import xyz.hrxcy.pojo.Wallet;
import xyz.hrxcy.service.WalletService;

import javax.annotation.Resource;

@Service
public class WalletServiceImpl implements WalletService {

    @Resource
    private WalletMapper walletMapper;

    @Override
    public Wallet queryMoney(String userId) {
        QueryWrapper<Wallet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        Wallet wallet = walletMapper.selectOne(queryWrapper);
        return wallet;
    }

    @Override
    public Wallet updateWallet(String total) {

        return null;
    }


}
