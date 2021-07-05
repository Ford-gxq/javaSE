package 面向对象的练习;
/**
 * 小练习：定义一个抽象父类Developer-->子类java继承Developer开发者，web继承Developer重写父类的抽象方法
 *      并写测试类进行测试
 *
 * */
public class AbstractExample {
//此处定义测试类
  public static void main(String[] args) {
    Java java=new Java();
    java.ac();
    java.developerWork();
    java.sleep();
    Www w=new Www();
    w.sleep();
}

}
//定义Developer1抽象类
   abstract class Developer1{
    public abstract  void  developerWork();
    public abstract  void  sleep();

}
//java子类继承Developer父类--->重写了父类的所有方法---具体子类
class  Java extends  Developer1{

    @Override
    public void developerWork() {
        System.out.println("java程序员正在开发程序...");
    }

    @Override
    public void sleep() {
        System.out.println("边敲代码边睡觉..");
    }
        //除了重写之外还可以新增方法
        //新增方法
        public void ac(){
            System.out.println("与产品和测试吵架!!!!");
        }

}
//定义一个Web类继承Developer1--->抽象子类
  abstract  class Web extends   Developer1{
    @Override
    public void developerWork() {
        System.out.println("Web开发工程师正在开发web页面..");
    }


}
//定义前端开发工程师继承Web-->实现Web抽象子类
   class Www extends Web{
    @Override
    public void sleep() {
        System.out.println("边唱歌边休息..");
    }
}
