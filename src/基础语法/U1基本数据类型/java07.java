package 基础语法.U1基本数据类型;

/**
 * @author lam
 * @data 2025/1/18 下午11:00
 * @description
 */
public class java07 {
    public static void main(String[] args) {

        //（7）相同数据类型之间的类型转换
        //低精度可以转换为高精度，而高精度转低精度需要【强制类型转换】

        int a = 2;
        long b = 4;
        //b = a;
        a = (int)b;

        float c = 4.0f;
        double d = 7.0;
        c = (float)d;
    }
}
