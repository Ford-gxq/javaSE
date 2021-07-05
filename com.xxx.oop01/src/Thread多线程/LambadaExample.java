package Thread多线程;
/**
    Runnable 函数型接口--->被实现的接口中只有一个被重写的抽象方法
 */
public class LambadaExample {
    //内部类
    static class Inner implements Runnable{
        @Override
        public void run() {
            for(int i=1;i<=100;i++){
                System.out.println("一边吃饭...");
            }
        }
    }

    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    System.out.println("一边讲话...");
                }
            }
        }).start();

        //Lambda表达式
        new Thread(()->{
            for(int i=1;i<=100;i++){
                System.out.println("一边上厕所...");
            }
        }).start();
        new Thread(new Inner()).start();
        for(int i=1;i<=100;i++){
            System.out.println("一边喝水...");
        }
    }
}
