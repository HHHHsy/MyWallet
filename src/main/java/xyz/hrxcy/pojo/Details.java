package xyz.hrxcy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Details {

    @TableId(type = IdType.AUTO)
    private int dId;
    private String walletId;
    private BigDecimal changeAmount;
    private String status;
    private String remark;
    private BigDecimal balance;
    private String createTime;
}
