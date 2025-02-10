package 基础语法.U2运算符;

/**
 * @author lam
 * @data 2025/1/21 上午2:06
 * @description
 */
public class java08 {
    public static void main(String[] args) {

        //(8)三目运算符
        //(true/false)?结果A:结果B

//        int a = (false ? 2 : 3);
//        System.out.println(a);

        int a = 2;
        int b = 3;
        int c = (a > b) ? a : b;//leetcodeT521
        System.out.println(c);

        int x = Math.max(5,6);
        System.out.println(x);


    }
}
