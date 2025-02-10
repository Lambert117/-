package 基础语法.U1基本数据类型;

/**
 * @author lam
 * @data 2025/1/20 上午1:50
 * @description
 */
public class java09 {

    public static void main(String[] args) {

        //(9)自动类型转换
        //不同数据类型之间进行算数运算的时候，java会自动把所有低精度数据转换为最高精度在进行计算

    int a = 5;
    long b = 6;
    double c = 7;
    double d = a + b + c;
        System.out.println(d);
    }
}
