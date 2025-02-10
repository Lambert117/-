package 基础语法.U1基本数据类型;

import java.math.BigInteger;

/**
 * @author lam
 * @data 2025/1/20 上午2:09
 * @description
 */
public class java13 {

    public static void main(String[] args) {

        //（13如果整数存储范围超出long
        long a =9223372036854775807L;
        System.out.println(Long.MAX_VALUE);

        BigInteger b = new BigInteger("9223372036854775807426");
        System.out.println(b);

    }
}
