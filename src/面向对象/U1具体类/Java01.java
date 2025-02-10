package 面向对象.U1具体类;

/**
 * @author lam
 * @data 2025/2/6 上午1:02
 * @description
 */
public class Java01 {
    public static void main(String[] args) {

        //(1)Java语言中数据类型的分类
        //第一类：基本数据类型（8个）
        //第二类：类类型(引用类型)

        //(2)基本数据类型和类类型的区别
        //基本数据类型：存储的是真实的值
        //类类型存储的是对象在内存中地址的值

        //(3)值传递：在调用方法的过程中传递参数、返回数据的原理
        //基本数据类型传递的是【真实的值】
        //类类型传递的是【地址的值】

        //基本数据类型的理解
        int a = 2;//a(2)
        m1(a);//a(2)方法的调用
        System.out.println(a);//方法调用完成还是存的真实值a(2)

        //类类型的理解
        int[] c = {1,2};//c(301) ->   [1,2](地址301)
        m2(c);//c(301)
        System.out.println(c[0]);
    }

    //c(301) ->
    //         [1,2](301)
    //d(301) ->
    public static void m2(int[] d){// d(301)、两个变量中存储的是同一个对象的地址
        d[0] = 3;
    }

    public static void m1(int b){//传参 b(2)
            b = 3;//b(3)
    }

    public static int m3(){
        int a = 3;
        return a;
    }

    public static int[] m4(){
        int[] x = {1,2,3};
        return x;//返回对象地址的值
    }
}
