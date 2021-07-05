package ArraysExample;
import java.util.Arrays;
/**
    Arrays工具类
        封装了一系列操作数组相关的方法
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        //原数组
        int[] arr = {8,7,6,5,4,1,2,3};
        int[] arr1 = {8,7,6,5,4,1,2,3};
        int[] arr2 = new int[5];
        arr2[0] = 111;
        arr2[4] = 666;

        //二维数组
        int[][] arr3 = {{1,2,3},{1,2}};
        int[][] arr4 = {{1,2,3},{1,2}};
        /**
            static int[] copyOf(int[] original, int newLength) 根据原数组中的数据进行拷贝,实现 截取 拷贝 填充功能
                参数
                    original : 原数组
                    newLength : 新数组的长度
                newLength>original.length    把原数组中索引为0位置数据开始拷贝,全部数据都拷贝到新数组中  尾部空余位置默认值填充
                newLength=original.length    拷贝
                newLength<original.length    从原数组索引为0位置开始拷贝,拷贝newLength个
                返回值:
                    新数组
         */
        System.out.println(Arrays.toString(Arrays.copyOf(arr,8)));
        System.out.println(arr==Arrays.copyOf(arr,8)); //返回新数组对象,与原数组地址不同
        System.out.println(Arrays.toString(Arrays.copyOf(arr,5)));
        System.out.println(Arrays.toString(Arrays.copyOf(arr,10)));

        //static int[] copyOfRange(int[] original, int from, int to) 将指定数组的指定范围复制到新数组中。
        //注意: 结束索引不包含,一般指定结束索引的位置都不包含
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,2,5)));

        //static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 将指定源数组中的数组从指定位置开始复制到目标数组的指定位置。
        System.arraycopy(arr,5,arr2,1,3);
        System.out.println(Arrays.toString(arr2));

        //boolean equals(int[] a, int[] a2) 如果两个指定的int数组彼此相等 ，则返回 true 。
        System.out.println(arr == arr1);
        System.out.println(Arrays.equals(arr,arr1));
        System.out.println(Arrays.equals(arr3,arr4));
        //static boolean deepEquals(Object[] a1, Object[] a2) 如果两个指定的数组彼此深度相等,则返回true 。 -->针对于多维数组
        System.out.println(Arrays.deepEquals(arr3,arr4));
        //static String toString(int[] a) 返回指定数组内容的字符串表示形式。
        System.out.println(Arrays.toString(arr3));
        //static String deepToString(Object[] a) 返回指定数组的“深层内容”的字符串表示形式。
        System.out.println(Arrays.deepToString(arr3));
        //static void fill(int[] a, int val) 将指定的int值分配给指定的int数组的每个元素。
        //static void fill(int[] a, int fromIndex, int toIndex, int val) 将指定的int值分配给指定的int数组的指定范围的每个元素。->结束索引不包含
        Arrays.fill(arr2,1000);
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2,1,arr2.length,10000);
        System.out.println(Arrays.toString(arr2));
        //static void sort(int[] a) 将指定的数组按升序排序。 默认升序
        //Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        //static void sort(int[] a, int fromIndex, int toIndex) 按升序对数组的指定范围进行排序。
        Arrays.sort(arr1,1,4);
        System.out.println(Arrays.toString(arr1));
        //下课练习: 定义字符类型,与字符串类型的数组,使用sort做升序排序

        /**
        static int binarySearch(int[] a, int key) 使用二进制搜索算法在指定的int数组中搜索指定的值。
            返回值: 查询到的数据所在的索引
                    如果没查到返回 -插入点-1
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,9));
    }
}
