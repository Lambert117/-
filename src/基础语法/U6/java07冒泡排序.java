package 基础语法.U6;

/**
 * @author lam
 * @data 2025/1/27 下午10:56
 * @description
 */
public class java07冒泡排序 {
    public static void main(String[] args) {

        //(7)数组：排序算法

        //冒泡排序
        //每次从第一个元素两两比较。大的到后边 (互换)。每次确定一个最大值
        //(1) 数组中有几个元素就冒几次泡
        //(2) 每次从下标零元素两两比较，如果前边元素大互换两个元素位置、每次确定一个最大值 (下一次不用比较)

        int[]  arr = {1, 3, 7, 5, 9};
        //(1)
        for (int i = 0; i < arr.length; i++) {

            //(2)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
