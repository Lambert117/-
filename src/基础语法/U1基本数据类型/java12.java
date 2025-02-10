package 基础语法.U1基本数据类型;

import java.math.BigDecimal;

/**
 * @author lam
 * @data 2025/1/20 上午2:06
 * @description
 */
public class java12 {

    public static void main(String[] args) {

        //(12)BigDecimal:如果超出double存储范围
        //BigDecimal视为无限大取决于磁盘大小
        double a = 1.7976931348623157E308;
        System.out.println(Double.MAX_VALUE);

        BigDecimal x = new BigDecimal("1.7976931348623157E309");
        System.out.println(x);

    }
}
