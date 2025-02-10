package 基础语法.U3流程控制语句;

/**
 * @author lam
 * @data 2025/1/21 上午3:54
 * @description
 */
public class java05 {
    public static void main(String[] args) {

        //(5)do while循环（很少用了）
        //while循环是先判断在执行
        //do while循环是先执行再判断.至少执行一次

        //1-10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }
}
