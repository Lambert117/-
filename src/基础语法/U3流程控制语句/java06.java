package 基础语法.U3流程控制语句;

/**
 * @author lam
 * @data 2025/1/23 上午2:24
 * @description
 */
public class java06 {
    public static void main(String[] args) {

        //(6)循环中的2个关键字
        //continue关键字：表示终止循环中的一次，直接执行下一次
        //break关键字：表示直接终止整个循环，循环退出。注意：只能退出当前的一个循环
//        return关键字：可以使用return关键字退出多重循环嵌套。return：返回表示代码终止。

        while (true)
        for (int i = 0; i < 11; i++) {
            if (i == 3 || i == 5 || i == 7){
//                continue;
//                break;
                return;
            }
            System.out.println(i);
        }
    }
}
