package 集合_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 Set接口和List接口一样，同样继承自Collection接口， 它与Collection接口中的方法基本一致，
 *  并没有对Collection接口进行功能上的扩充，只是比Collection接口更加严格了。
 *  与List接 口不同的是，Set接口中元素无序，并且都会以某种规则保证存入的元素不出现重复。
 *     Set接口主要有两个实现类:
 * 分别是HashSet和TreeSet。 其中，HashSet是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能。
 *    TreeSet则是以二叉树的方式来存储元素，它可以实现对集合中的元素进行排序。
* */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("章泽天");
        set.add("刘强东");
        set.add("哈哈");
        set.add("哈哈");
        Iterator<String> it = set.iterator();
      while (it.hasNext()){
          String s = it.next();
          System.out.println(s);
      }

    }


}
