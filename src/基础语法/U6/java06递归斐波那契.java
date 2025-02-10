package 基础语法.U6;

/**
 * @author lam
 * @data 2025/1/27 下午10:46
 * @description
 */
public class java06递归斐波那契 {
    public static void main(String[] args) {

        // 斐波那契数列
        // 序号：1 2 3 4 5 6 7 8 9 10 11
        // 结果：1 1 2 3 5 8 13 21 34 55 89

        int result = m(8);
        System.out.println(result);
    }

    //返回第n项的值
    //m(n) = m(n-1) +  m(n-2)
    public static int m(int n) {
    if (n == 1 || n == 2) {
        return 1;
}
        return m(n-1) +m(n-2);
    }
}
