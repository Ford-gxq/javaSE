package block_static;
/**
  static 关键字 静态的
 1. static是成员修饰符,只能修饰成员,不能修饰局部
    修饰变量: 类变量|静态变量--->独一份的,存在与静态区中
    修饰方法: 类方法|静态方法
    修饰块
    修饰类..
 2.  静态内容的使用方式
                    类名.静态变量名
                    类名.静态方法名(实参);
                    对象引用.静态变量名
                    对象引用.静态方法名(实参);
 3. 特点:
        静态内容都是独一份的,在第一次加载完成之后进行初始化
        成员变量跟随对象在对象的堆内存中存在,没有对象就没有成员
        静态变量就会存在于静态区中,静态变量是多个对象共享的变量
 4. 注意事项:
        在静态内容中,只能直接使用静态的内容,成员内容需要跟随对象使用
        在成员内容中,可以直接使用静态内容,也可以直接使用成员内容
    静态的内容是属于类的
    成员的内容是属于对象的
    静态变量与成员变量初始顺序-->先静态后成员
 **/
public class StaticDemo01 {
    //类中方法外部就是成员位置
    //成员变量
    static int a;
    int b ;
    public static void main(String[] args) {
        //测试静态内容的使用
        StaticDemo01 sd = new StaticDemo01();
        System.out.println(StaticDemo01.a);
        System.out.println(sd.a);
        System.out.println(a);  //使用当前类中的静态变量a可以省略类名
        System.out.println(sd.b);
        sd.test();
        testStatic();
        StaticDemo01.testStatic();
        sd.testStatic();
    }

    public static void testStatic(){
        System.out.println("静态方法");
    }

    //成员方法
    public void test(){
        System.out.println("成员方法");
    }
    //测试成员内容中使用静态和费静态
    public void haha(){
        test(); //在成员方法中的this默认指代调用当前成员方法的对象,如果没有同名问题,可以省略this.
        testStatic();
    }
}
