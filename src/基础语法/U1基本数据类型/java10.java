package 基础语法.U1基本数据类型;

/**
 * @author lam
 * @data 2025/1/20 上午1:55
 * @description
 */
public class java10 {

    public static void main(String[] args) {

        //(10)int(32)和char(16)之间的类型转换
        //说明：
        //char->int: 字符对应的编码
        //int->char: 编码对应的字符

        char c = '我';
        int i = c;
        System.out.println(i);//变为十进制的

        int x = 25105;
        char y = (char) x;
        System.out.println(y);
    }
}
