package xyz.hrxcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
    private int id;
    private String walletId;
    private String userId;
    private BigDecimal money;
}
