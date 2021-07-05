/**
   1. block 块 {}->作用域
   {} 局部代码块|普通语句块-->方法中或者语句块中       执行时机: 所在的方法调用
   把相同逻辑的一段代码定义在块中,具有语义化，自成作用域
 2.  {} 构造块             -->类中方法外部             执行时机: new对象时候
 对成员内容进行一些初始行为
 3.  static{} 静态块     --->类中方法外
 对静态内容实现初始化
 对一些配置..只需要执行一次，后续重复使用的代码可以定义在静态块中,做一些初始行为,不用封装方法调用
 4. 同步块
 注意:
 static 成员修饰符  只能修饰成员变量不能修饰局部
 局部变量不能被外部调用,因为存在于方法的栈帧中,跟随方法调用而存在
 构造块代码先于构造器代码之前执行,如果出现多个构造块,从上到下依次执行
 在类第一次加载完成之后就行初始化,并且只执行一次
 如果存在多个静态块,丛上到下依次执行.

 静态块  -> 主方法 -> 构造块 -> 构造器
 **/
public class BlockDemo01 {
    static int i;

    int a ;

    //静态块
    static{
        System.out.println("静态块1");
    }
    static{
        System.out.println("静态块2");
    }
    static{
        System.out.println("静态块3");
    }

    //构造器
    public BlockDemo01(){
        System.out.println("构造器");
    }

    //构造块
    {
        a =10;
        System.out.println("构造块1");
    }
    {
        System.out.println("构造块2");
    }
    {
        System.out.println("构造块3");
    }

    public static void main(String[] args) {
        System.out.println(i);  //10
        //局部
        int i = 1;
        System.out.println(i); //1
        //局部代码块
        {
            i = 100;
            System.out.println(i); //100
        }
        System.out.println(i); //100

        BlockDemo01 bd1 = new BlockDemo01();
        BlockDemo01 bd2 = new BlockDemo01();
    }

}
