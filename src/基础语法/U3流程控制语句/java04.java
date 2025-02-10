package 基础语法.U3流程控制语句;

/**
 * @author lam
 * @data 2025/1/21 上午3:48
 * @description
 */
public class java04 {
    public static void main(String[] args) {

        //(4)while循环
        //A(T)-B-A(T)-B-A(F)-退出
        //while (A) { B }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(i);
//        }

        //for 和 while可以互换

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }


    }
}
