package ArraysExample;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class Example01 {
    public static void main(String[] args) {
        //原数组
        int [] arr={1,2,11,55,20};
        int [] arr1={8,6,5,4,3,2,1};
        int [] arr2=new int[5];
        arr2[0]=11;
        arr2[4]=222;
    //static int[] copyOf(int[] original, int newLength) 根据原数组中的数据进行拷贝,实现 截取 拷贝 填充功能
        System.out.println(Arrays.toString(Arrays.copyOf(arr,6)));//新数组拷贝了原数组的同时超出部分填充0
        //新数组的地址与原数组的地址不一样  因此返回false
        System.out.println(arr==Arrays.copyOf(arr,6));
        System.out.println(arr==Arrays.copyOf(arr,4));//截取
        /**static int[] copyOfRange(int[] original, int from, int to) 将指定数组的指定范围复制到新数组中。
        注意: 结束索引不包含,一般指定结束索引的位置都不包含*/
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,2,5)));//运行结果 [11,55,20]
        //static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 将指定源数组中的数组从指定位置开始复制到目标数组的指定位置。
        System.arraycopy(arr,2,arr2,1,3);
        System.out.println(arr2);
        //boolean equals(int[] a, int[] a2) 如果两个指定的int数组彼此 相等 ，则返回 true
        System.out.println(arr==arr2);
        System.out.println(Arrays.equals(arr,arr1));
        //static boolean deepEquals(Object[] a1, Object[] a2) 如果两个指定的数组彼此深度相等,则返回true 。 -->针对于多维数组
        //二维数组
        int[][] arr3 = {{1,2,3},{1,2}};
        int[][] arr4 = {{1,2,3},{1,2}};
        System.out.println(Arrays.deepEquals(arr3,arr4));

    }



}
