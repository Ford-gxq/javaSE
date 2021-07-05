package exercise_Interface;
/**
 * 利用接口做参数，写个计算器，能完成加减乘除运算。
 * （1）定义一个接口Compute含有一个方法int computer(int n, int m)。
 * （2）设计四个类分别实现此接口，完成加减乘除运算。
 * （3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，
 *       此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
 * （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算
 *
 * */
//测试类
public class Example02 {
    //设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算
    public static void main(String[] args) {
        new UseCompute().useCom(new Sum(),5,6);//加法
        new UseCompute().useCom(new Minus(),55,12);//减法
        new UseCompute().useCom(new Multiplication(),50,122);//使用计算器传入乘法的引用
        new UseCompute().useCom(new Div(),100,5);//调用计算器传入除法的引用

    }
}
//定义一个计算器接口类
 interface Compute {
   abstract   int computer(int n, int m);
 }
 //求和类继承实现计算器接口
 class Sum implements  Compute{
  @Override
     public int computer(int n,int m){
      return n+m;
   }
 }
  //减法
     class Minus implements Compute{
      @Override
      public int computer(int n,int m){
          return n-m;
      }
  }
      //求乘法
      class Multiplication implements  Compute{
          @Override
          public int computer(int n,int m){
              return n*m;
          }
  }
  //div除法
      class Div implements  Compute{
          @Override
          public int computer(int n, int m) {
              if (m == 0){
                  System.out.println("被除数不能为0！请重试！");
                  System.exit(0);
              }
              return n/m;
          }

    }
    //设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)
    //  此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
    class UseCompute{
        public void useCom(Compute com, int one, int two){//方法含有三个参数参数1是计算器类，后两个参数为运算的数
            System.out.println(com.computer(one, two));
        }
    }

