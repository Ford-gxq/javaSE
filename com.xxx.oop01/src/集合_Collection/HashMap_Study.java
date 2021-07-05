package 集合_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    HashMap
        底层结构: 哈希表(数组+链表+红黑树)
        特点:
            存储键值对数据
            无序的,去重根据key
            查询,删除,增加效率较高
   哈希表:
     数组:  Node[] : 每一个索引位置-->位桶-->单向链表的首节点|树结构
           Node :hash(key)->位桶的索引, key , value , next
           位桶的索引: key-->hashcode()得到一个整数的int返回值 -->整数int的值进行一定的hash算法->计算出桶的索引->key的hash值
     存储过程:
        1.计算key的hash值->桶的索引->确定了存储在节点数组中的哪一个桶中
        2.判断桶中是否存在首节点,没有链表,当前节点对象作为链表头直接放入桶中
        3.如果存在首节点->遍历这个链表的每一个节点,每一个节点的key是否与当前存放的Node节点的key相等,value覆盖,
                         如果都不相等,当前要存放的Node节点追加到链表的最后
        4.判断如果存放了新节点,长度+1,覆盖原有节点的value,长度不变
    默认初始容量initialCapacity: 16->Node[]
    加载因子|装载因子loadFactor: 0.75
    扩容的临界点: 当容量*.75就扩容
    初始容量和加载因子一般不建议改变
 */
public class HashMap_Study {
    public static void main(String[] args) {
        Map<Integer,Employee> map=new HashMap<>();
        map.put(1,new Employee(1001,"张三",18,18000));
        map.put(2,new Employee(1002,"李四",19,15000));
        map.put(3,new Employee(1003,"赵六",20,15000));
        map.put(4,new Employee(1004,"狗蛋",22,16000));
        map.put(5,new Employee(1005,"张三",23,13000));
        System.out.println(map);
        //遍历1
       /**
        * Set <Map.Entry<K,V>> entrySet()
              K getKey() 返回与此条目对应的键。
              V getValue()
              */
        Set<Map.Entry<Integer,Employee>>  entries=map.entrySet();//map.entrySet()方法返回一个Set集合
        for(Map.Entry<Integer,Employee>  entry: entries){
            System.out.println(map.get(entry.getKey()));

        }

    }

 }
