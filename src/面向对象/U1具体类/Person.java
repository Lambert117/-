package 面向对象.U1具体类;

/**
 * @author lam
 * @data 2025/2/6 下午4:50
 * @description
 */
public class Person {
    //person就是类

    //name、age就是成员变量
    String name;

    int age;

    //构造方法
    Person(){

    }

    public Person(String name, int age){

    }

    //成员方法
    public static void swim(){
        System.out.println("游泳");
    }

    public void eat(){
        System.out.println("吃饭");
    }

}
