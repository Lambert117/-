package 基础语法.U4数组;

/**
 * @author lam
 * @data 2025/1/21 上午4:11
 * @description
 */
public class java03 {
    public static void main(String[] args) {

        //(3)数组的遍历

        int[] a = {1,2,3,4,5};

        //方式一：通过 下标遍历元素
        //数组长度的属性：数组.length
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //方式二：通过元素遍历
        for (int  b:a){
            System.out.println(b);
        }
    }
}
