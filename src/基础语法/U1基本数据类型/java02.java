package 基础语法.U1基本数据类型;

/**
 * @author lam
 * @data 2025/1/18 上午2:01
 * @description
 */
public class java02 {
    public static void main(String[] args) {

        //(2)java基本数据类型：浮点数类型
        //float[32]、double[64]
        //浮点型相同点为都可以存储小数，不同点为存储范围由小到大

        //单精度
        //注意：用float存储小数的时候必须用F或f结尾
        float a = 1.23f;
        System.out.println(a);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        //双精度浮点数（Dd可加可不加）
        double b = 1.2345;
        System.out.println(b);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

    }
}
