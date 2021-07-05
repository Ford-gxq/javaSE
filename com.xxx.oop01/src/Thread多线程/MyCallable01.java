package Thread多线程;
/**
 *
 * 定义一个类MyCallable实现Callable接口,在MyCallable类中重写call()方法
 *  *       创建MyCallable类的对象,创建Future的实现类FutureTask对象，
 *          把MyCallable对象作为构造方法的参数;
 *  *       创建Thread类的对象，把FutureTask对象作为构造方法的参数;
 *          启动线程,再调用get方法，就可以获取线程结束之后的结果。
 *
 * */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable01 implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟女孩表白" + i);
        }
        //返回值就表示线程运行完毕之后的结果
        return "答应";
    }
}

 class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的call方法
        MyCallable01 mc = new MyCallable01();
        //Thread t1 = new Thread(mc);

        //可以获取线程执行完毕之后的结果.也可以作为参数传递给Thread对象
        FutureTask<String> ft = new FutureTask<>(mc);

        //创建线程对象
        Thread t1 = new Thread(ft);

        String s = ft.get();//获取线程结束之后的结果
        //开启线程
        t1.start();

        //String s = ft.get();
        System.out.println(s);
    }
}