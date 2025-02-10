package 基础语法.U1基本数据类型;

/**
 * @author lam
 * @data 2025/1/18 上午2:15
 * @description
 */
public class java05 {
    public static void main(String[] args) {

        //（5）互换两个变量中的数据(法一)

        int a = 2;
        int b = 3;

        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);


        //互换两个变量中的数据(法二)
        int a1 = 7;
        int b1 = 5;
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println(a1);
        System.out.println(b1);


    }
}
