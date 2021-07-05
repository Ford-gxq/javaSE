package 注解;

import 注解.MyAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *注解解析器:
 *      通过反射操作注解,可以封装一个方法,封装类中..
 * */
public class ParseAnnotation_Demo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
     parseAnnotation(Annotation_Demo02.class,new Annotation_Demo02());

    }
  //解析器  //找到没有参数的方法调用
  public static void   parseAnnotation(Class cls, Object obj) throws InvocationTargetException, IllegalAccessException {
      //获取所有的方法
      Method[]  methods = cls.getDeclaredMethods();
      //遍历类对象的所有方法
      for(Method method: methods){
 //boolean isAnnotationPresent(类<? extends Annotation> annotationClass) 如果此元素上 存在指定类型的注释，则返回true，否则返回false。
          if (method.isAnnotationPresent(MyAnnotation.class)){
              MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
              System.out.println("注解上配置的参数值="+annotation.value());
             // System.out.println(annotation.zhujie());
              if(annotation.value()==1 && annotation.zhujie().equals("zhangsan")){
                  //System.out.println("hhh");
                  method.invoke(obj);
              }

          }

      }

  }


}
