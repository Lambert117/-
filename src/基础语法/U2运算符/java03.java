package 基础语法.U2运算符;

/**
 * @author lam
 * @data 2025/1/21 上午12:38
 * @description
 */
public class java03 {
    public static void main(String[] args) {

        //(3)逻辑运算符3个

        // &&逻辑与：表示并且的意思、要求两边条件同时满足。
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(true && true);//true
        System.out.println(false && false);

        // ||逻辑或：表示或者的意思、满足一个条件即可
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || true);
        System.out.println(false || false);//false

        // !逻辑非：表示取反的意思
        System.out.println(!true);
        System.out.println(!false);
    }
}
