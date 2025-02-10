package 基础语法.U6;

/**
 * @author lam
 * @data 2025/1/23 上午2:33
 * @description
 */
public class java01循环嵌套 {
    public static void main(String[] args) {

        //(1)循环嵌套思想：分步骤拆分思想；把一个复杂问题拆分成多个模块，一个一个解决。
        //开发：分两个步骤:1、设计  2、实现

        //  打印数字矩阵
        //1
        //12
        //123
        //1234
        //12345

        //(1)输出第1行到第5行

        for (int i = 1; i <=5;i++) {

            //(2)打印第i行的数字
            for (int j = 1; j <= i ;j++ ) {
                System.out.print(j);
            }

            //(3)换行输出
            System.out.println();
        }

        //  打印数字矩阵
        //1
        //121
        //12321
        //1234321
        //123454321

        for (int i1 = 1; i1 <=5;i1++) {

            //(2)打印第i行的递增数字
            for (int j1 = 1; j1 <= i1 ;j1++ ) {
                System.out.print(j1);
            }

            //(3)打印第i行的递减数字

            for (int j1 = (i1-1); j1 >= 1 ;j1--) {
                System.out.print(j1);
            }
            //(4)换行输出
            System.out.println();
        }
    }
}
