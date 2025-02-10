package 面向对象.U2抽象类;

/**
 * @author lam
 * @data 2025/2/9 上午2:11
 * @description
 */

    //(1)继承概念：子类通过extends关键字继承父类、父类所有成员子类都有
    //子类Java02  继承  父类C

public class Java02 extends C{
    public static void main(String[] args) {
        Java02 java02 = new Java02();
        System.out.println(java02.a);
        java02.f();
    }
}

class C{
      int a = 199;
      void f(){
          System.out.println(a);
      }
}
