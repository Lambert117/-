package 基础语法.U3流程控制语句;

/**
 * @author lam
 * @data 2025/1/21 上午3:11
 * @description
 */
public class java03 {

    public static void main(String[] args) {

        //(3)for循环语句
        //句式和执行流程
        //A->B(true/false)-true->D-C-B-D-C-B(F)-退出
        //for(A;B;C) { D }

        //打印1-10

        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }

        //10-1
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
        }
    }
}
