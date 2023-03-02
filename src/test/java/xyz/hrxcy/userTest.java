package xyz.hrxcy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class userTest {

    @Test
    public void test1(){
        BigDecimal a = new BigDecimal(0.12845);
        String s = String.format("%.2f", a);
        System.out.println(s);
    }
}
