package 面向对象.U2抽象类;

/**
 * @author lam
 * @data 2025/2/9 上午2:30
 * @description
 */

    //(1)类与类之间的继承关系
    //class具体类、abstract class抽象类
    //具体类 继承 具体类
    //具体类 继承 抽象类  最常用
    //抽象类 继承 具体类
    //抽象类 继承 抽象类

    //抽象类：父类。 设计
    //具体类：子类。 实现

    //需求：计算器：加减乘除

    //(2)父类和子类之间的；类型转换：向上转型、向下转型
    //子类转换为父类自动转换。父类转换为子类需要强制转换

public abstract class Java03 {
    abstract int method1(int a, int b);
    abstract int method2(int a, int b);
    abstract int method3(int a, int b);
    abstract int method4(int a, int b);
}

 class E extends Java03 {

     @Override
     int method1(int a, int b) {
         return 0;
     }

     @Override
     int method2(int a, int b) {
         return 0;
     }

     @Override
     int method3(int a, int b) {
        return 0;
     }

     @Override
     int method4(int a, int b) {
         return 0;

     }
 }
