package 集合_Collection;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 *
 * */
public class ListIteratorDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("霍元甲");
        list.add("倩女幽魂");
        list.add("喜剧之王");
        list.add("速度与激情7");
        list.add("叶问");

        //获取一个迭代器对象
        ListIterator it=list.listIterator();
        //判断是否存在下一个元素
     /*   while(it.hasNext()){
            if("速度与激情7".equals(it.next())){
              it.add("速度与激情9");
            }
        }
        System.out.println(list);*/

        //反向遍历
        //ListIterator<E> listIterator(int index) 从列表中的指定位置开始，返回列表中元素的列表迭代器（按正确顺序）。
    /* 方法1.  ListIterator<String> it3  = list.listIterator(list.size());
        while(it3.hasPrevious()){
            //previousIndex 上一个元素索引    previous 上一个元素
            System.out.println(it3.previousIndex()+"-->"+it3.previous());
        }
*/
    // 方法2. 注意：此处反向遍历打印：先使用ArrayList的ListIterator迭代器正向遍历然后游标指向最后一个元素的位置，在逆向遍历即可。
   /*  while (it.hasPrevious()){
         System.out.println(it.previous());
     }*/
        ListIterator<String> li = list.listIterator();// 获得ListIterator对象
        for (li = list.listIterator(); li.hasNext();) {// 将游标定位到列表结尾
            System.out.println( li.next());
        }
        for (; li.hasPrevious();) {// 逆序输出列表中的元素
            System.out.print(li.previous() + " ");
        }

    }


}