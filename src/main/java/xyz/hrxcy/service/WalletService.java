package xyz.hrxcy.service;

import org.apache.ibatis.annotations.Param;
import xyz.hrxcy.mapper.UserMapper;
import xyz.hrxcy.pojo.Details;
import xyz.hrxcy.pojo.Wallet;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface WalletService  {
    //查新钱包余额
    Map<String, Object> queryMoney(String userId);

    //消费
    Wallet changeWallet(String userId,BigDecimal tempAmount,String remark,int status);

    //获取钱包明细
    List<Details> getAllWalletChange(@Param("id") String userId);

}
