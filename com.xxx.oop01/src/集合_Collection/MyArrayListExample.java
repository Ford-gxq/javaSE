package 集合_Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 手写ArrayList
* */
public class MyArrayListExample {
    public static void main(String[] args) {
    MyArrayList mylist=new MyArrayList();
    mylist.add("张三");
    }

}

//定义一个MyArrayList类
 class MyArrayList{
    private int size;//定义数组的长度
    private  String [] arr;

    //空参构造
    public MyArrayList() { }

    //定义一个添加数据的方法
    public void add(String  value){
        //如果第一次添加
        if(arr==null ||arr.length==0){
        //创建数组长度为1的数组  然后把数据放入数组中
            arr=new String[1];
            arr[0]=value;
        }else {
            //备份原数组地址
            String[] temp=arr;
            //不是第一次添加数组
            //创建数组长度是原数组+1
           arr=new String[size+1];
            //原数组中数据拷贝到新数组,然后value放入最后
            for (int i = 0; i <size ; i++) {
                arr[i]=temp[i];
            }
          arr[size]=value;
        }
        size++;

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
    //定义一个返回sizede


}