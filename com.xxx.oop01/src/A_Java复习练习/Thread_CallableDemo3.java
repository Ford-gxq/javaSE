package A_Java复习练习;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**实现多线程方式三: 实现Callable接口:
 * 1.方法介绍:
 *      | V call()                           计算结果，如果无法计算结果，则抛出一个异常
 *      | FutureTask(Callable<V> callable)   创建一个 FutureTask，一旦运行就执行给定的 Callable
 *      | V get()                            如有必要，等待计算完成，然后获取其结果
 *2. 实现步骤
 *        定义一个类MyCallable实现Callable接口
 *        在MyCallable类中重写call()方法
 *        创建MyCallable类的对象
 *        创建Future的实现类FutureTask对象，把MyCallable对象作为构造方法的参数
 *        创建Thread类的对象，把FutureTask对象作为构造方法的参数
 *        启动线程
 *        再调用get方法，就可以获取线程结束之后的结果。
 *3. 三种实现方式的对比
 *        1)实现Runnable、Callable接口
 *             好处: 扩展性强，实现该接口的同时还可以继承其他的类
 *             缺点: 编程相对复杂，不能直接使用Thread类中的方法
 *        2)继承Thread类
 *             好处: 编程比较简单，可以直接使用Thread类中的方法
 *             缺点: 可以扩展性较差，不能再继承其他的类
 * */
//定义MyCallable类实现Callable接口
  class   MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i <=20 ; i++) {
            System.out.println("跟女孩表白" + i);
        }
        //返回值就表示线程运行完毕之后的结果
        return "答应";
    }
}
//main方法测试运行
public class Thread_CallableDemo3 {
   public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的call方法
        MyCallable mc=new MyCallable();
        //可以获取线程执行完毕之后的结果.也可以作为参数传递给Thread对象
        FutureTask<String> ft = new FutureTask<>(mc);
        //创建线程对象-->把未来任务对象作为构造参数传递给Thread构造器
        Thread t1 = new Thread(ft);
        //String s = ft.get();
       /*这里需要注意，应该在开启线程之后调用线程对象的get方法获取执行后结果，否则程序无法正常运行*/
        //开启线程
        t1.start();
       String s = ft.get();
       System.out.println(s);
    }

}
