package blockDemo;
/**
 *
 * **/
public class BlockDemo {
    static  int i;//静态变量
    int a;//成员变量
  //空构造
    public BlockDemo(){}
    //有参构造
    public BlockDemo(int a){
        System.out.println(a);
    }
    //构造块1
    {
        int a=100;
        System.out.println("构造块1_"+a);
    }
    //构造块2
    {
        int a=200;
        System.out.println("构造块2_"+a);
    }
    //静态块
   static {
         int  i=10;
        System.out.println(i);

    }

    public static void main(String[] args) {
        BlockDemo bd=new BlockDemo(8);
        System.out.println(bd.a);
    }
}
