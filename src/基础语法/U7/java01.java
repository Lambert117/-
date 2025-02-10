package 基础语法.U7;

/**
 * @author lam
 * @data 2025/1/25 上午1:36
 * @description
 */
public class java01 {

    public static boolean m2(int[] b,int i){
        for (int j:b) {
            if (j==i){
                return true;
            }
        }
        return false;
    }

    public static void m1(int[] a, int[] b) {
        for(int i:a) {
            if (m2(b, i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        //打印两个数组的交集

        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7};
        m1(a,b);
    }
}
