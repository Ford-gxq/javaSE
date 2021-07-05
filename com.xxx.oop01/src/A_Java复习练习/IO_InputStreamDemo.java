package A_Java复习练习;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *`java.io.InputStream`抽象类是表示**字节输入流**的所有类的**超类**（父类），可以读取字节信息到内存中。
 *  它定义了字节输入流的基本共性功能方法：
 * 一、字节输入流的基本共性功能方法:
 *        1、public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
 *        2、public abstract int read()： 从输入流读取数据的下一个字节。
 *        3、public int read(byte[] b)： 该方法返回的int值代表的是读取了多少个字节，读到几个返回几个，读取不到返回-1
 *二、FileInputStream的构造方法：
 *     1、FileInputStream(File file)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
 *     2、FileInputStream(String name)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名name命名。
 *三、FileInputStream读取字节数据：
 *
 *
 *
 *
 * */
public class IO_InputStreamDemo {
    public static void main(String[] args) throws IOException {
    //创建输入流对象
        FileInputStream in=new FileInputStream("F:\\自动创建的文件夹\\d.txt");
        // 使用File对象创建流对象
//        File file = new File("a.txt");
//        FileInputStream fos = new FileInputStream(file);
        //读取数据，一次读一个字节  ---> public abstract int read()： 从输入流读取数据的下一个字节。
        int read = in.read();
        System.out.println((char) read);
        read = in.read();
        System.out.println((char) read);
        /**第二种读取数据的方式*/
         // 定义变量，作为有效个数
         int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[1024];
        // 循环读取--->public int read(byte[] b)  读不到数据就会返回-1
         while((len=in.read(b))!=-1){
             // 每次读取后,把数组变成字符串打印
             System.out.println(new String(b));
         }
         in.close();//关闭资源

    }

}
