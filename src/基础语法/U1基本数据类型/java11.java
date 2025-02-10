package 基础语法.U1基本数据类型;

import java.math.BigDecimal;

/**
 * @author lam
 * @data 2025/1/20 上午2:01
 * @description
 */
public class java11 {

    public static void main(String[] args) {

        //(11)
        //注意：java语言浮点型计算时候很有可能出现误差。。金融 、科学不允许有误差
//        double a = 1.0;
//        double b = 0.9;
//        System.out.println(a-b);


        //创建对象句式
        BigDecimal x = new BigDecimal("1.00");
        BigDecimal y = new BigDecimal("0.90");
        System.out.println(x.subtract(y));


    }
}
