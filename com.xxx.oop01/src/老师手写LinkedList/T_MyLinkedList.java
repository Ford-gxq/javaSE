package 老师手写LinkedList;
/**
    手写LinkedList -->了解
    通过单向链表
 */
public class T_MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.size());
        //list.add("");
        System.out.println(list.size());
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        System.out.println(list.size());

        System.out.println(list);
    }
}

//自定义链表容器类
class MyLinkedList{
    private Node head; //链表头节点
    private int size; //存储数据的个数

    public MyLinkedList() {
    }

    //添加方法
    public void add(Object value) {
        //新节点
        Node node = new Node(value,null);
        //判断是否作为链表头节点
        if(head==null && size == 0){
            head = node;
            size++;
            return;
        }
        //不是链表头, 遍历原链表,找到最后一个节点,指向新节点
        Node temp = head; //遍历链表  temp指向遍历的每一个节点
        while(true){
            //当前节点的next属性是否不为null,指向下一个节点
            if(temp.getNext()!=null){
                //temp 指向 下一个节点
                temp = temp.getNext();
            }else{
                break;
            }
        }
        //原链表最后一个节点-->next属性值为新节点
        temp.setNext(node);
        size++;

    }

    public int size(){
        return this.size;
    }

    //toString
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Node temp = head; //用作循环遍历是执行每一个节点
        while(true){
            if(temp==null){
                break;
            }
            sb.append(temp.getData()+", "); //把当前temp指向的节点的数据拼接到字符串中
            temp = temp.getNext(); //指向下一个节点
        }

        String str = sb.toString();
        if(str.endsWith(", ")){
            str = str.substring(0,str.length()-2);
        }

        return str+"]";
    }
}


//节点类
class Node{
    private Object data; //数据
    private Node next;  //下一个节点的地址

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}