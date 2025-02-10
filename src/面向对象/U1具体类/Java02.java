package 面向对象.U1具体类;

/**
 * @author lam
 * @data 2025/2/7 上午3:10
 * @description
 */
public class Java02 {
    public static void main(String[] args) {

        //(1)类类型的变量和对象之间的引用关系
        //一个变量可以引用零个或一个对象
        //一个对象 可以被多个变量引用

        //(2)null空关键字：只能用于类类型、表示变量存储的对象地址为空，谁也不引用

//        Employee a = new Employee("张三",30);
//        System.out.println(a);
//        a = new Employee("李四",40);
//        System.out.println(a);
//        a = nulll;
//        System.out.println(a);

        Employee b = new Employee("张三",30);
        Employee c = b;
        c.setName("李四");
        Employee d = b;
        d.setAge(20);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
