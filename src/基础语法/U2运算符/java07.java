package 基础语法.U2运算符;

/**
 * @author lam
 * @data 2025/1/21 上午2:01
 * @description
 */
public class java07 {
    public static void main(String[] args) {

        //(7)自增自减运算符
        //注意：++放在运算表达式的前边：先自增、再参与运算
        //注意：++放在运算表达式的后边：先参与运算、再自增
        //--同理

        int a = 4;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

    }
}
