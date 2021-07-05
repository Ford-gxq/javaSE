package Stream流;
import java.util.Optional;
import java.util.stream.Stream;
/**
终止行为:
    reduce 规约   流操作的每一个数据拿过来当做操作数进行指定行为的计算,最终的得到一个结果
       Optional<T> reduce(BinaryOperator<T> accumulator);   流操作的前两个数据作为行为的参数传递,结果作为下一次运算的第一个参数,流操作的后面的数据作为第二个参数,结果...
       T reduce(T identity, BinaryOperator<T> accumulator); 第一个参数identity,作为运算的起始值.流操作的第一个数作为第二个参数,结果作为下一次运算的第一个参数,流操作的后面的数据作为第二个参数,结果...
       <U> U reduce(U identity,--了解-->必须使用并行流
      BiFunction<U, ? super T, U> accumulator,
      BinaryOperator<U> combiner);
      U identity : 流操作的每一个元素加工运算的起始值
      BiFunction<U, ? super T, U> accumulator, : 流操作的每一个元素的再工运算
      BinaryOperator<U> combiner : 流操作的所有数据的结果运算
 */
public class Class_reduce {
    public static void main(String[] args) {
        Optional<Integer> op =  Stream.of(1,2,3,4,5).reduce((x, y)->{
            System.out.println("x="+x+",y="+y);
            return x+y;
        });
        System.out.println(op.get());


        System.out.println(Stream.of(1,2,3,4,5).reduce(100,(x, y)->{
            System.out.println("x="+x+",y="+y);
            return x+y;
        }));

        //了解
        System.out.println(Stream.of(1,2,3,4,5).parallel().reduce(
                10,
                (x,y)->{
                    System.out.println(Thread.currentThread().getName()+" : "+x+"------>"+y);
                    return x+y;
                },
                (x,y)-> {
                    System.out.println(x+"--最终---->"+y);
                    return x+y;
                }
        ));


    }
}
