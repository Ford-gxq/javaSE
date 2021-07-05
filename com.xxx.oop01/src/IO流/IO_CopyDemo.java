package IO流;

import java.io.*;
/**
    通过字节流实现文件的拷贝
        文件-->程序--->文件
    模仿实现一个图片的拷贝
 */
public class IO_CopyDemo {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        FileInputStream is=new FileInputStream("D:/haha.txt");
        FileOutputStream os=new FileOutputStream("D:/heihei.txt");
        //2.读取数据---写入数据
        byte [] chs=new byte[1024];
        int length=-1;//记录每次读入到数组中数据的个数
        while ((length=is.read(chs))!=-1){
           os.write(chs,0,length);//把读入的指定长度的数据写入目标文件
        }
        //3.刷出
        os.flush();
        //4.关闭资源
        os.close();
        is.close();
    }



}
