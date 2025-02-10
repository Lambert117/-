package 基础语法.U6;

/**
 * @author lam
 * @data 2025/1/24 上午2:47
 * @description
 */
public class java02多维数组 {
    public static void main(String[] args) {

        //多维数组思想：用一维数组的思想来理解多维数组
        //关键：脑海中只有一维数组。都只按照一维数组来理解

        //二维数组
        int[][] a = {{1,2},{3,4,5}};
        System.out.println(a[0][1]);

        for (int[]x:a){
            //遍历x数组
            for(int y:x){
                System.out.println(y);
            }
        }

        //三维数组
        int[][][] b = {{{1, 2}, {3, 4}, {5}}};
        System.out.println(b[0][0][1]);

        for (int[][]x:b){
            for (int[]y:x){
                for(int z:y){
                    System.out.println(z);
                }
            }
        }
    }
}
