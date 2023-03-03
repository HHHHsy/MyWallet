package xyz.hrxcy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
    @TableId(type = IdType.AUTO)
    private int id;
    private String userId;
    private String walletId;
    private BigDecimal money;

    @TableField(exist = false)
    private List<Details> details;
}
