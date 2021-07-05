package 集合_Collection;
/**
 *测试Vector：
 *  Vector底层是用数组实现的List ,相关的方法都加了同步synchronized检查,因此"线程安全,效率低".
 *  比如，indexOf方法就增加了synchronized同步标记。
 *  public synchronized int indexOf (Object o，int index) {  /代码省略  }
 *
 * 如何选用ArrayList、LinkedList、 Vector?
 * 1.需要线程安全时,用Vector.
 * 2.不存在线程安全问题时,并且查找较多用ArrayList(一般使用它)。
 * 3.不存在线程安全问题时,增加或删除元素较多用LinkedList.
 *
 * */
public class VectorDemo {


}
