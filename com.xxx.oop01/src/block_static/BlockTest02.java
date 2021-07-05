package block_static;
/**
	构造块的代码在编译期间会被编译到构造器代码中,在构造器代码之前
	debug 调试工具
		1.追踪程序的执行过程
		2.定位,调试异常情况出现的位置
		3.观察程序执行过程中变量的变化情况
		4.学习源码了解执行过程
	使用步骤:
	 1) 打断点
	 	当程序执行到断点位置,停下来,之后的执行由程序猿自己控制
	 	行号的后面单击打断点
	 2) debug环境运行
	 	常用快捷键:
	 		step over F8 继续执行下一步,如果下一步是方法的调用,不进入
	 		step into F7 继续执行下一步,如果下一步是方法的调用,进入方法,如果是源码方法不进入
	 		Force step into alt+shift+F7 继续执行下一步,如果下一步是方法的调用,强制进入方法,如果是源码方法强制进入
	 		step out shift+f8 调出到方法调用的位置
 **/
public class BlockTest02 {
    public static int a = 0;
    {
        a = 10;
        System.out.println("3 、非静态代码块执行a=" + a); //10
    }
    static {
        a = 6;
        System.out.println("1 、静态代码块执行a=" + a); //6
    }
    public BlockTest02() {
        this(a); //6
        System.out.println("6、"+a);  //10
        System.out.println("7、无参构造方法执行a=" + a); //10
    }
    public BlockTest02(int n) {  //n=6
        System.out.println("4 、"+n); //6
        System.out.println("5、"+a);// 10
    }
    public static void main(String[] args) {
        System.out.println("2  、main"); //main
        BlockTest02 tsc = new BlockTest02();
        System.out.println(tsc);
    }
}