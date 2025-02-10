package 基础语法.U1基本数据类型;

/**
 * @author lam
 * @data 2025/1/18 下午11:10
 * @description
 */
public class java08 {

    public static void main(String[] args) {

        //（8）整数类型和浮点数类型之间的类型转换
        //整数类型转换为浮点类型没问题，但是浮点型转换为整型必须【强制类型转换】

        long a = 4;
        float b = 7.0f;
        a = (long) b;
        System.out.println(a);
    }
}
