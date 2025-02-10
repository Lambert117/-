package 基础语法.U1基本数据类型;

import java.util.Arrays;

/**
 * @author lam
 * @data 2025/1/18 上午1:43
 * @description
 */
public class java01 {
    public static void main(String[] args) {

        //(1)java基本数据类型：整数类型
        //byte[8]、short[16]、int[32]、long[64](由小到大)

        //byte 字节
        byte a = 1;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //short 短整型
        short b = 2;
        System.out.println(b);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //int 整型（默认的整数类型，开发中常用）
        int c = 3;
        System.out.println(c);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //long 长整型
        long d = 4;
        System.out.println(d);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
