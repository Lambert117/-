package 面向对象.U2抽象类;

import javax.xml.namespace.QName;

/**
 * @author lam
 * @data 2025/2/10 上午3:04
 * @description
 */

    //this和super
    //this: 表示当前类的对象
    //super：表示父类的引用

    class J {
        int x = 3;
}

public class Java06this关键字super关键字 extends J {
        int x = 4;

        void m() {
            System.out.println(this.x);
            System.out.println(super.x);
        }

    String name;
    int age;

    public Java06this关键字super关键字() {
    }

    public Java06this关键字super关键字(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Java06this关键字super关键字{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
