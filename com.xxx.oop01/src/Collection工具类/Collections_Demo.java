package Collection工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
  1.  Collections 工具类
        与Arrays类似
    void sort(List) //对List容器内的元素排序,排序的规则是按照升序进行排序。
    void shuffle(List) //对List容器内的元素进行随机排列
    void reverse(List) //对List容器内的元素进行逆续排列
    void fill(List, Object) //用一个特定的对象重写整个List容器
    int binarySearch(List, Object)//对于顺序的List容器，采用折半查找的方法查找特定对象
2.   HashMap的线程不安全问题:
        1.使用Hashtable 类型->线程安全的哈希表
             如果不需要线程安全实现，建议使用HashMap代替Hashtable 。
              如果需要线程安全的高度并发实现，则建议使用ConcurrentHashMap代替Hashtable 。
        2.Collections->static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)  返回线程安全的Map
        3.juc包下的ConcurrentHashMap -->推荐

 */
public class Collections_Demo {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();

        ls.add(5);
        ls.add(3);
        ls.add(4);
        ls.add(1);
        ls.add(2);

        System.out.println(ls);

        //sort默认升序排序
        Collections.sort(ls);
        System.out.println(ls);

        //随机排序
        Collections.shuffle(ls);
        System.out.println(ls);

        //翻转
        Collections.reverse(ls);
        System.out.println(ls);

        //binarySearch 先升序排序
        Collections.sort(ls);
        System.out.println(ls);
        System.out.println(Collections.binarySearch(ls,14));
    }
}
