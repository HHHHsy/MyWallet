package xyz.hrxcy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.stereotype.Service;
import xyz.hrxcy.mapper.DetailsMapper;
import xyz.hrxcy.mapper.UserMapper;
import xyz.hrxcy.mapper.WalletMapper;
import xyz.hrxcy.pojo.Details;
import xyz.hrxcy.pojo.User;
import xyz.hrxcy.pojo.Wallet;
import xyz.hrxcy.service.WalletService;
import xyz.hrxcy.utils.GetNowSystemTimeAndUUID;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Service
public class WalletServiceImpl implements WalletService {
    static final String STATUS_PAY = "支出";
    static final String STATUS_INC = "收入";

    @Resource
    private UserMapper userMapper;

    @Resource
    private WalletMapper walletMapper;

    @Resource
    private DetailsMapper detailsMapper;

    @Override
    public Map<String, Object> queryMoney(String userId) {
        QueryWrapper<Wallet> queryWrapper = new QueryWrapper<>();
        Map<String,Object> res = new HashMap<>();

        queryWrapper.eq("user_id",userId);
        Wallet wallet = walletMapper.selectOne(queryWrapper);
        String name = userMapper.selectOne(new QueryWrapper<User>().eq("user_id", userId)).getName();
        BigDecimal money = wallet.getMoney();
        res.put("name",name);
        res.put("money",money);
        return res;
    }

    @Override
    public Wallet changeWallet(String userId,BigDecimal tempAmount,String remark,int status) {
        UpdateWrapper<Wallet> change = new UpdateWrapper<>();
        Wallet wallet = walletMapper.selectOne(new QueryWrapper<Wallet>().eq("user_id",userId));
        BigDecimal balance;
        if (status == 0) {
            balance = wallet.getMoney().subtract(tempAmount);
        } else {
            balance = wallet.getMoney().add(tempAmount);
        }
        change.set("money",balance)
                .eq("user_id",userId);
        if ((walletMapper.update(wallet, change)) > 0){
            Details details = new Details();
            details.setChangeAmount(tempAmount);
            details.setWalletId(wallet.getWalletId());
            details.setBalance(balance);
            details.setRemark(remark);
            details.setStatus(status != 0 ? STATUS_INC : STATUS_PAY);
            details.setCreateTime(GetNowSystemTimeAndUUID.getTime());
            detailsMapper.insert(details);
        }
        return walletMapper.selectOne(new QueryWrapper<Wallet>().eq("user_id",userId));
    }

    @Override
    public List<Details> getAllWalletChange(String userId) {
        return walletMapper.queryAllDetailed(userId);
    }


}
