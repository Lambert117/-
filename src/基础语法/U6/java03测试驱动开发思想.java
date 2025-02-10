package 基础语法.U6;

/**
 * @author lam
 * @data 2025/1/24 上午2:59
 * @description
 */
public class java03测试驱动开发思想 {
    public static void main(String[] args) {

        //方法思想：测试驱动思想
        //开发过程中没思路，从实现者转换为需求者

        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        //(1)求数组中元素的偶数和
//        (2)求数组中的质数和（只能被1和他本身整除的数）
        int x = 0;
        for (int a:arr) {
            if (m(a)) {
                x += a;
            }
        }
        System.out.println(x);
    }

    //判断是否是质数，如果是返回true，不是则返回false
    public static boolean m(int b) {
        for (int i = 2; i < b; i++ ) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }
}
