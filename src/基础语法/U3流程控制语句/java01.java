package 基础语法.U3流程控制语句;

/**
 * @author lam
 * @data 2025/1/21 上午2:43
 * @description
 */
public class java01 {
    public static void main(String[] args) {
        //单分支if
        int x = 10;

        if( x < 20 ){
            System.out.print("这是 if 语句");
        }
        //两分支的if语句
        if( x < 20 ){
            System.out.print("这是 if 语句");
        }else{
            System.out.print("这是 else 语句");
            }
        //多分支的if语句
        if( x == 10 ){
            System.out.print("Value of X is 10");
        }else if( x == 20 ){
            System.out.print("Value of X is 20");
        }else if( x == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("这是 else 语句");
        }
    }
}
