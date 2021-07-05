package A_Java复习练习;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *一、 字节输出流抽象父类(OutputStream)的共性方法：
 *  1、 public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
 *  2、 public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
 *  3、 public void write(byte[] b)：将 b.length个字节从指定的字节数组写入此输出流。
 *  4、 public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 *                  **也就是说从off个字节数开始读取一直到len个字节结束**
 *  5、 public abstract void write(int b) ：将指定的字节输出流。
 *
 **二、以上五个方法则是字节输出流都具有的方法，由父类OutputStream定义
 * FileOutputStream类: 继承OutputStream:
 *    构造方法：
 *      1、 public FileOutputStream(File file)：根据File对象为参数创建对象。
 *      2、 public FileOutputStream(String name)： 根据名称字符串为参数创建对象。
 *         第二种方法：例子：FileOutputStream outputStream = new FileOutputStream("D:\\abc.txt");
 * 三、文件输出流的写出数据操作步骤：
 *    1) 创建文件输出流对象  2)写出数据 3）刷出 4）关闭流
 *    写出数据的方法：使用FileOutputStream写出字节数据主要通过`Write`方法，而`write`方法分如下三种
 *          | 1)public void write(int b)         每次可以写出一个字节数据
 *          | 2)public void write(byte[] b)     每次可以写出数组中的数据
 *          | 3)public void write(byte[] b,int off,int len)  **写出指定长度字节数组**：`write(byte[] b, int off, int len)` ,
 *                                                               每次写出从`off`索引开始，`len`个字节
 * 四、FileOutputStream实现数据追加续写、换行:
 *      1、public FileOutputStream(File file, boolean append)
 *      2、public FileOutputStream(String name, boolean append)
 *      这两个构造方法，第二个参数中都需要传入一个boolean类型的值，`true` 表示追加数据，`false` 表示不追加也就是清空原有数据。
 *      这样创建的输出流对象，就可以指定是否追加续写了
 *
 * */

public class IO_OutpputStream{
    public static void main(String[] args) throws IOException {
        //1. 使用File对象创文件输出流对象
        File file = new File("F:\\自动创建的文件夹\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        // 使用文件名称创建文件输出流对象
        FileOutputStream fo = new FileOutputStream("F:\\b.txt");
        //2. 写出数据
      /*第一种写出数据*/
        fos.write(97); // 写出第1个字节
        fos.write(98); // 写出第2个字节
        fos.write(99); // 写出第3个字节
        //数据刷出
        fos.flush();
        //关闭流
        fos.close();
        /*第二种方式写入数据*/
       FileOutputStream os=new FileOutputStream("F:\\自动创建的文件夹\\c.txt");
       byte[] b = "我想吃烤烤红薯".getBytes();
        // 写出字节数组数据
        os.write(b);
        //刷出
        os.flush();
        //关闭
        os.close();
        /*第三种方式写入数据*/
        FileOutputStream os1=new FileOutputStream("F:\\自动创建的文件夹\\d.txt",true);
        byte[] bytes="马云说996是年轻人的福报！你信吗？".getBytes();
        os1.write("\r".getBytes());
        os1.write(bytes,0,bytes.length);
        //刷出关闭
        os1.flush();
        os1.close();

        /**______________________________换行追写入数据______________________________________*/
       //创建文件输出流对象
        FileOutputStream out=new FileOutputStream("F:\\自动创建的文件夹\\d.txt",true);
        byte[] bs={97,98,99,100,101};
        // 遍历数组
        out.write("\r\n".getBytes());//换行要把回车符合换行符\r\n转换成字节数组写入文件
        out.write(bs);
    }


}
