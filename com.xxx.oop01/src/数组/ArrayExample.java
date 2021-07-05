package 数组;
/**
 * 二维数组的声明和初始化：
 * 1.数组中存放数组
 *         二维数组中每一个索引位置存在的数据为内层一维数组的地址
 *  2.   声明:
 *       数据类型[][] 数组名;  -->推荐
 *  3.   初始化:
 *        动态初始化:先创建数组,然后再赋值
 *        数据类型[][] 数组名 = new 数据类型[外层一维的长度][内层二维的长度];
 *        数据类型[][] 数组名 = new 数据类型[外层一维的长度][]; 内层的每一个二维数组还不确定,没有创建
 *
 *        静态初始化 : 创建数组的同时赋值
 *          数据类型[][] 数组名 = new 数据类型[][]{{1,2,3},{4,5},{6}....};
 *          数据类型[][] 数组名 = {{1,2,3},{4,5},{6}....};
 *     操作根据索引:
 *         数组名[外层一维数组索引][内层二维数组索引]
 *
 * */
public class ArrayExample {
    public static void main(String[] args) {
        //动态初始化
        int[][] arr1 = new int[3][2];
        char [][] arr2= new char[3][3];
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[1][0]=3;
        arr1[1][1]=4;
        arr1[2][0]=5;
        arr1[2][1]=6;
        arr2[0][0]='A';
        arr2[0][1]='B';
        arr2[0][2]='C';
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[2][0]);
        System.out.println(arr1[2][1]);

    }

}
