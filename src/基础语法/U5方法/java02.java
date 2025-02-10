package 基础语法.U5方法;

/**
 * @author lam
 * @data 2025/1/22 上午3:02
 * @description
 */
public class java02 {

    public static int m1 () {
        return 100;
    }

    public static boolean m2 (float a, double b) {
        System.out.println(a);
        System.out.println(b);
        return true;
    }

    public static void main(String[] args) {

        //有返回值的方法
        //定义：
        //return关键字： 返回的意思、把结果返回到方法的调用处
        //public static 返回类型 方法名字(参数列表) {方法的实现 return 返回结果；}
        //调用：
        //返回类型 变量 = 方法名字(参数列表)
        int a = m1();
        System.out.println(a);
        boolean b = m2(3.4f,5.3);
        System.out.println(b);

        int max = m3(4,6);
        System.out.println(max);
    }

    //返回2个变量中的最大值
    public static int m3 (int a, int b) {
        return (a > b ? a : b);
    }

}
