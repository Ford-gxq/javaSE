package 常用类_练习;
/**
    基本数据类型的包装类:
        byte            Byte
        short           Short
        int             Integer
        long            Long
        float           Float
        double          Double
        char            Character
        boolean         Boolean
        自动拆装箱:
            自动装箱   : 基本---->引用
            自动拆箱   : 引用---->基本
 */
public class Class05_Integer {
    public static void main(String[] args) {
        int i = 1;
        //自动装箱   Integer.valueof(i)
        Integer in = i;
        //自动拆箱   in.intValue()
        int i2 = in;

        test(1.1,2.2);

        //static int max(int a, int b) 返回两个 int值中较大的一个， int调用 Math.max一样 。
        //static int min(int a, int b)

    }
    static void test(Double d1,Double  d2){
        System.out.println(d1+d2);
    }
}
