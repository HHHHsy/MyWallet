package xyz.hrxcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Details {
    private int id;
    private String walletId;
    private BigDecimal expenditure;
    private BigDecimal income;
    private String remark;
    private BigDecimal balance;
    private String createTime;
}
