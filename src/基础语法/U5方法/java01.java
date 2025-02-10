package 基础语法.U5方法;

import java.util.Stack;

/**
 * @author lam
 * @data 2025/1/21 上午4:25
 * @description
 */
public class java01 {
    public static void m1() {
        System.out.println(1);
    }
    public static void m2(int a,double b,char c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    //打印两个整数中的最大值
    public static void m3(int a,int b) {
        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

        //方法的分类：2种
        //方法=功能
        //没有返回值的方法：只需要实现功能即可（实际开发很少用）
        //有返回值的方法：不但需要实现功能、还必须有一个返回结果。

        //（1）没有返回值的方法
        //定义：在类的大括号中
        //public static void 方法名字(参数列表) {方法实现}
        //调用：在main主方法中调用
        //方法名字（参数列表）
        m1();
        m2(1,2,'好');
        m3(4,7);
    }
}
