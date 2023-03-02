package xyz.hrxcy.service;

import xyz.hrxcy.pojo.Wallet;

public interface WalletService {
    //查新钱包余额
    Wallet queryMoney(String userId);

    //消费钱包
    Wallet updateWallet(String total);
}
