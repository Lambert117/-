package 基础语法.U5方法;

/**
 * @author lam
 * @data 2025/1/22 上午3:04
 * @description
 */
public class java03 {

    //自定义方法的角色：实现方法实现功能的人
    public static int m1(int c, int d){
        if(c > d) {
            return c;
        }
        return d;
    }

    public static void main(String[] args) {

        //在主方法中编写代码的角色：用户、使用方法调用方法的人
        //找出2个变量中的最大值
        int a = 1;
        int b = 2;
        int c = m1(a, b);
        System.out.println(c);
    }
}
