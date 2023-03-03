package xyz.hrxcy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.hrxcy.pojo.Details;
import xyz.hrxcy.pojo.Wallet;

import java.util.List;

@Repository
@Mapper
public interface WalletMapper extends BaseMapper<Wallet> {
    List<Details> queryAllDetailed(String userId);
}
