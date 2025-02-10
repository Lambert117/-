package 基础语法.U3流程控制语句;

/**
 * @author lam
 * @data 2025/1/21 上午2:56
 * @description
 */
public class java02 {
    public static void main(String[] args) {

        //(2)switch分支语句
        //说明：根据具体数值（byte、short、int、char、string）来执行不同的分支
        //break关键字：表示跳出关键switch语句

        int a = 3;
        switch (a) {
            case 1:{
                System.out.println("执行此条件1");
                break;
            }
            case 2:{
                System.out.println("执行此条件2");
                break;
            }
            case 4:{
                System.out.println("执行此条件4");
                break;
            }
            default:{
                System.out.println("没有符合的才执行此条件");
            }
        }
    }
}
