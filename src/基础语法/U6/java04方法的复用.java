package 基础语法.U6;

/**
 * @author lam
 * @data 2025/1/25 上午1:44
 * @description
 */
public class java04方法的复用 {
    public static void main(String[] args) {

        // 方法的复用：方法的重复使用、重复调用

        //返回2个数之中的最大值
        int a = 2;
        int b = 4;
        int c = m(a,b);
        System.out.println(c);
    }
    public static int m(int a, int b) {
        return a > b ? a : b;
    }
}
