package 面向对象.U1具体类;

/**
 * @author lam
 * @data 2025/2/8 上午1:27
 * @description
 */
public class Java04 {


        //static静态关键字
        //前提：区分类、对象
        //被static修饰成员叫静态成员、属于类。要通过【类.成员】方式来调用
        //不被static修饰成员叫非静态成员，属于对象。要通过【对象.成员】调用
        //

        static int a = 10;
        int b = 20;


    public static void main(String[] args) {
        System.out.println(Java04.a);
        Java04 java04 = new Java04();
        System.out.println(java04.b);

    }
}
