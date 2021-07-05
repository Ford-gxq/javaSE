package 集合_Collection;
/**
 *  测collection中的方法：
 *     List---ArrayList的常用方法:
 *    方法-----------------------------------说明：
 *     (1)boolean add(Object element)       增加元素到容器中
 *     (2)boolean remove(Object element)    从容器中移除元素
 *     (3)boolean contains(Object element)  容器中是否包含该元素
 *     (4) int size()                       容器中元素的数量
 *     (5) boolean isEmpty()                容器是否为空
 *     (6) void clear()                     清空容器中所有元素
 *      Iterator iterator()                 获得迭代器,用于遍历所有元素。
 *     public E get(int index)            返回集合中指定位置上的元素。
 *
 * */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample01 {
    public static void main(String[] args) {
        //boolean add(Object element)       增加元素到容器中
        //多态
        Collection col=new ArrayList();
        Collection col1=new ArrayList();
        col.add("luxu");
        col.add("zhangsan");
        col.add(1234);
        col.add('a');
        col.add(false);
        System.out.println(col);
        System.out.println(col.size());
      //boolean remove(Object element)    从容器中移除元素
        System.out.println(col.remove("luxu"));
        System.out.println(col);
    //boolean contains(Object element)  容器中是否包含该元素
        System.out.println(col.contains("zhangsan"));
     //boolean isEmpty()                容器是否为空
        System.out.println(col1.isEmpty());

        /**
         * 集合的两种遍历方式：
         * 1. 使用Iterator迭代器
         * 2. 使用增强foreach循环
         *
         * */
    //Iterator iterator()        获得迭代器,用于遍历所有元素。
        //1) 获取迭代器对象
        Iterator it=col.iterator();
        //2)判断是否存在下一个元素
        while (it.hasNext()){
            //3)获取下一个元素
            System.out.println(it.next());
        }
    for (Object ele:col){
        System.out.println(ele);
        }
        /**
         * List---ArrayList的常用方法二:  List集合取交集、并集、去除重复数据等
         *   方法-----------------------------------说明：
         *   boolean containsAll(Collection c)    本容器是否包含c容器中的所有元素？返回布尔值
         *    boolean addAll(Collection c)         将容器c中所有元表增加到本容器  --->(取交集)
         *    boolean removeAll(Collection c)      移除本容器和容器c中都包含的元素(取差集)
         *    boolean retainAll(Collection c)      取本容器和容器c中都包含的元素,移除非交集元素(两个容器取交集)
         *    Object[] toArray()                   转化成Object数组
         * */
        Collection col3=new ArrayList<String>();
        col3.add("zhangsan");
        col3.add(1234);
        col3.add(false);
        System.out.println(col.containsAll(col3));
        Collection col4=new ArrayList();
        col4.addAll(col);
        System.out.println(col4);
        // boolean removeAll(Collection c)      移除本容器和容器c中都包含的元素(取差集)
       // System.out.println(col.removeAll(col3));
       // System.out.println(col);
        // boolean retainAll(Collection c)      取本容器和容器c中都包含的元素,移除非交集元素(两个容器取交集)

        System.out.println(col.retainAll(col3));
        System.out.println(col);
    }




}
