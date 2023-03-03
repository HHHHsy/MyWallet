package xyz.hrxcy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import xyz.hrxcy.mapper.DetailsMapper;
import xyz.hrxcy.pojo.Details;
import xyz.hrxcy.pojo.Wallet;
import xyz.hrxcy.service.DetailsService;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class DetailsServiceImpl implements DetailsService {
    @Resource
    private DetailsMapper detailsMapper;

    @Override
    public Details queryDetailsByUserId(String userId) {
        QueryWrapper<Details> queryWrapper = new QueryWrapper<>();
        return null;
    }
}
