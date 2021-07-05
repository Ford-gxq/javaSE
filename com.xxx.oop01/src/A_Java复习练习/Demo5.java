package A_Java复习练习;
/**
 * 对象比较问题:
 *    1.如果两个基本数据类型比较==,如果数据值相等就返回true,否则false
 *    2.如果两个new Integer比较,肯定不相等->因为new在堆中是新的地址
 *    4.Intger i1与 Intger i2 比较如果数据值在[-128,127]之间,返回缓冲区对象相等,否则返回new Integer--->只有Iteger才有,其他包装不存在
 *    5.基本数据类型与包装类比较(Integer|new Integer),只要数据值相等就相等,因为会先发生自动拆箱
 * */
public class Demo5 {
    public static void main(String[] args) {
        int i1 = 127;
        int i2 = 127;
        Integer i3 = 127;
        Integer i4 = 127;
        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        Integer i7 = 128;
        Integer i8 = 128;

        System.out.println(i1==i2); //true
        //如果Integer i-->[-128,127]之间整数就相等,否则返回new Integer
        System.out.println(i3==i4); //true
        System.out.println(i1==i4); //true
        System.out.println(i5==i6); //false
        System.out.println(i1==i6); //true
        System.out.println(i3==i6); //false

        System.out.println(i7==i8);  //false


    }


}
