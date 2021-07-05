package Stream流;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
    Stream
        对数据源头（数组|集合）中存储数据的流式计算
        数组|集合：存储数据   Stream流： 对数据的计算
    特点：
        1.stream不能存储数据，数据源才能存储数据
        2.流是一次性的流,如果一旦修改,不可恢复
        3.stream流不会修改数据源中的数据
        4.延迟执行|惰性加载 : 流在执行中止行为时候,才会执行一些列的中间操作
    数据源 --> 流Stream -->一些列流式中间操作 --> 中止行为
    创建Stream的方式:
        1.集合Collection->stream()
 */
public class Class_Stream001 {
    public static void main(String[] args) {
        //1.集合类的静态方法 stream()
        Collection<Integer> stream= List.of(11,12,13,15);
        System.out.println(stream);

        //2.数组工具类Arrays.stream()
        String[] str={"张三","李四","王五","赵六"};
        Stream<String> stream2=Arrays.stream(str);
        System.out.println(stream2);
        //3.Stream.of()
       Stream stream3=Stream.of("张三","李四","王五","赵六");
        System.out.println(stream3);

    }


}
