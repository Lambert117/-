package 面向对象.U2抽象类;

/**
 * @author lam
 * @data 2025/2/8 上午3:02
 * @description
 */

//(1)抽象类：被abstract修饰的类叫做抽象类、表示抽象类的图纸和模板

//(2)构造方法：抽象类中有构造方法,不能创建对象

//(3)抽象方法：被abstract修饰的且没有方法体的方法叫做抽象方法
//说明：包含抽象方法的类一定是抽象类，抽象类不一定包含抽象方法

public abstract class Java01 {

        abstract void m1(int a, int b);

        String name;
        int age;

}
