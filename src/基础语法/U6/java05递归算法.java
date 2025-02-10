package 基础语法.U6;

/**
 * @author lam
 * @data 2025/1/25 上午1:47
 * @description
 */
public class java05递归算法 {

    //求n的阶乘： n * (n-1)
    public static int m(int n){
        if (n==1) {
            return 1;
        }
            return n * m(n - 1);

    }
    public static void main(String[] args) {

        //递归算法：方法自身调用自身
        //求5！阶乘

        int n =5;
        //实现方法m，求n的阶乘
        int x= m(n);
        System.out.println(x);

    }
}
