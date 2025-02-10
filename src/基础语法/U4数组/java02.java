package 基础语法.U4数组;

/**
 * @author lam
 * @data 2025/1/21 上午4:11
 * @description
 */
public class java02 {
    public static void main(String[] args) {

        //(2)数组中元素的存取
        //说明：数组中的元素的存、取都必须通过下标实现。
        //说明：数组的下标是从零开始计数的。

        int[] a = {5, 3, 1, 6, 8};
        int b = a[3];
        System.out.println(b);
        a[4] = 100;
        System.out.println(a[4]);

        int[] c = {2, 4, 6};
        int d = c[0];
        c[0] = c[2];
        c[2] = d;
        System.out.println(c[0]);
        System.out.println(c[2]);
    }
}
