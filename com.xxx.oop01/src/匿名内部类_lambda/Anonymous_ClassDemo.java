package 匿名内部类_lambda;
/**
 * 匿名内部类: 没有定义名称的内部类--->作用：
 *         为了简化没有自己本身作用,只是为了重写抽象方法的实现类,可以使用匿名内部类来代替
 *  匿名内部类对象表现形式:
 *             new 接口|抽象类 (构造器实参) {
 *                 接口实现类的类体|抽象类子类的类体;
 *             }
 * */
public class Anonymous_ClassDemo {
    public static void main(String[] args) {
     //猫实例化对象调用跑到方法
        Cat cat=new Cat();
        cat.run();
        //方式1：
        //new了一个Run接口不知名的实现类的对象--->接口多态
        //引用r指向匿名内部类对象,后续可以跟随引用r重复使用
        Run1 r = new Run1(){ //实现类的类体
            @Override
            public void run() {
                System.out.println("边跳边跑...");
            }
        };
        r.run();
        //匿名内部类的匿名对象 ,只能在当前使用一次

        // 方式:2：此处是直接new了一个匿名内部类，在这个匿名内部类里面重写了run方法，然后这个对象再调用run()的方法
        new Run1(){
            @Override
            public void run(){
                System.out.println("我是匿名内部类的run方法");
            }

        }.run();

        //方式3：作为方法的实参传递
        test(new Cat());
        //调用test方法，实参是一个Run1接口的匿名实现内部类的对象
        test(
                //实参是一个Run1接口的匿名实现内部类的对象
                new Run1() {
            @Override
            public void run(){
                System.out.println("我是Run1接口的匿名实现内部类的run方法...");
            }
          }
        );
    }


    //定义一个成员方法将接口作为参数类型，实参肯定为这个接口的实现类对象
    static void test(Run1 r){
        r.run();
    }

}


//定义一个接口
    interface Run1{
    void run();
}
//目标: 使用接口中的抽象方法run--->提供一个实现类,重写抽象方法,调用run()
class Cat implements  Run1{
    @Override
    public void run() {
        System.out.println("小猫跑了...");
    }
}

 class Person implements  Run1{
    @Override
     public void run(){
        System.out.println("人正在跑步...");
    }
 }