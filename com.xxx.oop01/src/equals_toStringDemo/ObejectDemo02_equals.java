package equals_toStringDemo;
import objectExample.Student;

/**
    Object 类中的equals方法
    ==比较数据是否相等   基本数据->数据值    引用数据类型->地址值
    equals 比较两个对象是否相等
         public boolean equals(Object obj) {
            return (this == obj);
         }
         Object类中的equals默认比较地址,如果想要比较其他内容(成员变量的值)->重写equals方法
    注意:
        以后javabean要求重写toString 与 equals方法
    == 与 equals之间的区别
    练习:
        自定义员工类,姓名,编号,身高..
        要求:比计较员工是否相等要求比较所有成员属性的值,都想等true,任何一个不相等返回false
 */
class ObjectDemo02_equals {
    public static void main(String[] args) {
        Student s1=new Student(1001,"张三",18);
        Student s2 = new Student(1001,"李四",19);
        System.out.println(s1==s2);  //地址
        System.out.println(s1.equals(new String()));  //内容
    }
}

