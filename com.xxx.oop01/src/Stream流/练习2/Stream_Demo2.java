package Stream流.练习2;

import java.util.*;
import java.util.stream.Stream;

/**
 *Stream流的常见生成方式
 1. Collection体系的集合可以使用默认方法stream ()生成流
 default Stream<E> stream ( )
 2. Map体系的集合间接的生成流
 3. 数组可以通过Stream接口的静态方法of (T... values )生成流

 */
public class Stream_Demo2 {

    public static void main(String[] args) {
   //1.Collection体系的集合可以使用默认方法stream ()生成流
        /*list集合*/
        List<String> list=new ArrayList<>();
        Stream<String> stream = list.stream();//生成左边的快捷键ctrl+Alt+v
        /*set*/
        HashSet<String> set = new HashSet<>();
        Stream<String> streamset = set.stream();

   //2.Map体系的集合间接的生成流
        HashMap<String, Integer> map = new HashMap<>();
        Stream<String> keystream = map.keySet().stream();
        Stream<Integer> valuestream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entrystream= map.entrySet().stream();
    //3.数组可以通过Stream接口的静态方法of (T... values)生 成流
       String[] arrString={"hello","world","java"};
        Stream<String> arrString1 = Stream.of(arrString);
        Stream<String> arrString2=Stream.of("zhangsan","李四","wangwu");
        Stream<Integer> integerStream = Stream.of(11, 22, 30, 12);


    }

}
