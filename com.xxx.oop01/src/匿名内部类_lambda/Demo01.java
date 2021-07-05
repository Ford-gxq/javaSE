package 匿名内部类_lambda;
/**
    匿名内部类
        类,内部类,没有显示定义类名
        为了简化没有自己本身作用,只是为了重写抽象方法的实现类,可以使用匿名内部类来代替

        匿名内部类对象表现形式:
            new 接口|抽象类 (构造器实参) {
                接口实现类的类体|抽象类子类的类体;
            }
 */
public class Demo01 {
    public static void main(String[] args) {
        HeHe h = new HeHe();
        h.run();

        //new了一个Run接口不知名的实现类的对象
        //接口多态
        //引用r指向匿名内部类对象,后续可以跟随引用r重复使用
        Run r = new Run(){ //实现类的类体

            @Override
            public void run() {
                System.out.println("变跳边跑...");
            }
        };

        r.run();
        r.run();
        r.run();

        //匿名内部类匿名对象 ,只能在当前使用一次
        new Run(){

            @Override
            public void run() {
                System.out.println("变吃变跑");
            }
        }.run();

        //作为方法的实参传递
        test(new HaHa());

        test(new Run() {
            @Override
            public void run() {
                System.out.println("变敲代码边跑...");
            }
        });

    }

    //接口作为参数类型,实参肯定为这个接口的实现类对象
    static void test(Run r){
        r.run();
    }


}


interface Run{
    void run();
}

//目标: 使用接口中的抽象方法run
//提供一个实现类,重写抽象方法,调用
class HaHa implements Run{

    @Override
    public void run() {
        System.out.println("变哭边跑...");
    }
}

class HeHe implements Run{

    @Override
    public void run() {
        System.out.println("变笑边跑...");
    }
}