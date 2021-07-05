package block_static;
//输出答案
public class StaticTest02 {
    public static int id; //类变量|静态变量--->类的静态变量在方法区的静态区中初始化id=0
    public int age; //成员变量
    public static void main(String[] args) {
        StaticTest02 staticTest02 = new StaticTest02();//实例化staticTest02在堆内存中开辟空间0X001-->成员变量跟随对象进入堆内存初始化 age=0
        staticTest02.age=10;//对象引用为成员变量age赋值为10
        System.out.println(StaticTest02.id);// 输出类的静态变量值id=0
        System.out.println(staticTest02.age);//对象调用成员变量age输出为10

        staticTest02.change(); //第一次调用成员方法，在堆内存中开辟空间0x002-->id=1   age=10    //id=1  staticTest02.age=1 方法使用完毕，栈帧释放
        System.out.println(StaticTest02.id); //1
        System.out.println(staticTest02.id);  //此处对象指的是0X001--->因此id是1
        System.out.println(staticTest02.age);  //此处对象指的是0X001--> age=10
        staticTest02.change();  //第二次调用change方法开辟堆空间-->0X003  第一句打印 ：id=2    age=10（此处的age仍为0X001的age值）
                                // 第二句打印：id=2  staticTest02.age=1
        System.out.println(id);  //id=2
        System.out.println(staticTest02.age);  //age=10
       //当main方法执行完毕栈帧释放
    }
    public void change() {
        StaticTest02 staticTest02 = new StaticTest02();//实例化类对象staticTest02,成员变量跟随对象进入堆内存初始化 age=0
        staticTest02.age++;//类对象的成员变量age：1
        StaticTest02.id++;//类对象的类变量的id为1
        System.out.println("In Change(): id = " + id + " age = " + age);  //第一次调用id=1   age=10
        System.out.println("In Change(): id = " + id + " staticTest02.age = " + staticTest02.age);//第一次调用 id=1  staticTest02.age=1
        //id=2  staticTest02.age=10
    }
}
