package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解类
        @interface定义注解类型
        自定义的注解类型都默认实现java.lang.annotation.Annotation接口
        自定义的注解类型不能显示继承其他父类实现其他接口
        自定义注解类型中可以定义注解字段 ()
        注解字段可以设置默认值default
        注解字段可以使用的权限修饰符public|default
        如果当前注解类中只有一个字段,字段名建议定义为value,赋值的时候可以直接赋值
        注解字段的数据类型只能为: 基本数据类型,字符串,Annotation,ENUM枚举类型或者以上的类型的数组
 */
public class Annotation_Demo02 {
    //通过MyAnnotation注解可以指定当前被注解的方法的参数个数
    @MyAnnotation(value = 1,zhujie = "zhangsan")
   public void test(int a, String s){
        System.out.println("我是2个参数的注解");
    }
  @MyAnnotation(value = 1,zhujie = "lisi")
  public  void test1(int x, String s,String s2){
      System.out.println("我是三个参数的注解");
 }
   @MyAnnotation(value = 2,zhujie = "haha")
  public   void test2(int x, String str){

     }

}

//自定义注解类型
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    /*注解字段*/
    int value() default 1;
    String zhujie();

}