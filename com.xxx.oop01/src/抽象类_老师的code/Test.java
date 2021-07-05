package 抽象类_老师的code;

public class Test {
    public static void main(String[] args) {
        //测试抽象类的使用
        //Worker work = new Worker();

      Developer w = null ;

        //具体子类
        w= new Java();
        w.sleep();
        w.work();

        w = new WebWeb();
        w.sleep();
        w.work();

        //多态
        Developer ww = new Java();
    }
}
