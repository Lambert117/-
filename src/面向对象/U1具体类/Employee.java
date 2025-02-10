package 面向对象.U1具体类;

// 开发类的步骤：典型案例：需求2个员工：张三30、李四40
// 1.创建一个员工类
// 2.编写成员变量
// 3.生成构造方法(无参、有参)：创建对象
// 4.生成getter和setter方法：存取操作
// 5,生成toString方法：打印对象信息更加方便（不生成会打印对象的地址、生成会打印对象的变量信息
// 6.根据类创建出对象

//(1)类的概念：被class关键字修饰的叫做类。
//类的理解 ：表示显示生活中的【图纸】或【模板】
public class Employee {

    //(2)成员变量的概念：在类中定义的量就是成员变量
    //成员变量的理解：表示类的【属性】或【状态】
    private String name;

    private int age;




    //(3)成员方法的概念：在类中定义的方法就是成员方法
    //成员 方法的理解：表示类的【功能】或【行为】
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



    //(4)构造方法的概念：方法名和类同名，并且没有返回值也void关键字
    //构造方法的理解：根据类创建对象所调用的方法
    public Employee() {

    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        //(5)对象的概念：Java语言使用new关键字创建出来的实例叫做对象
        //对象的理解：表示现实生活中根据【图纸】或【模板】生产出来制造出来的具体实例
        //类【设计图纸】->[则需要调用构造方法]->对象【真实实例】

        //(6)创建对象的语法格式：
        // 类名 变量 = new 构造方法
        //调用无参构造方法创建对象
        Employee e1 = new Employee();
        e1.setName("张三");
        e1.setAge(30);
        System.out.println(e1);

        //调用有参构造方法创建对象
        Employee e2 = new Employee("李四",40);
        System.out.println(e2);
    }

}
