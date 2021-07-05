package 集合_Collection;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 Map就是用来存储"键(key)-值(value) 对”的。Map类中存储的 "键值对”通过键来标识,所以"键对象"不能重复。
 Map接口的实现类有HashMap、TreeMap、 HashTable、 Properties等。
 Map接口中常用的方法:
 方法---------------------------------------------说明
  Object  put(Object key, Object value)   存放键值对
  Object  get(Object key)                 通过键对象查找得到值对象
  Object  remove(Object key)              删除键对象对应的键值对
  boolean containsKey(Object key)         Map容器中是否包含键对象对应的键值对
  boolean containsValue(Object value)     Map容器中是否包含值对象对应的键值对
  int      size()                         包含键值对的数量
  boolean isEmpty()                       Map是否为空
   void putAll(Map t)                     将t的所有键值对存放到本map对象
   void clear()                           清空本map对象所有键值对
 * */

public class Map_StudyDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
       // Object  put(Object key, Object value)   存放键值对
        map1.put(1001,"张三丰");
        map1.put(1002,"马云");
        map1.put(1003,"马化腾");
        map1.put(1003,"马化腾2");
        map1.put(1004,"马化腾");
        System.out.println(map1);
        //Object  get(Object key)       通过键对象查找得到值对象
        System.out.println(map1.get(1002));
        // Object  remove(Object key)     删除键对象对应的键值对
        System.out.println(map1.remove(1003));
        //boolean containsKey(Object key)         Map容 器中是否包含键对象对应的键值对
        System.out.println(map1.containsKey(1001));

        //boolean containsValue(Object value)     Map容器中是否包含值对象对应的键值对
        System.out.println(map1.containsValue("麻花藤"));
        // int      size()              包含键值对的数量
        System.out.println(map1.size());

      //static <K,​V>  Map<K,​V> of​(K k1, V v1) 返回包含单个映射的不可修改的映射。
        System.out.println();
    }
}
