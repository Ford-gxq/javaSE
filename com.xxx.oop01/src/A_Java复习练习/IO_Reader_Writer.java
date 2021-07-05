package A_Java复习练习;

import java.io.*;

/**
 *Reader抽象类是 字符输入流的所有类的超类（父类），可以读取字符信息到内存中。
 * 一、 字符输入流的共性方法：
 *     1、public void close() ：关闭此流并释放与此流相关联的任何系统资源。
 *     2、public int read()： 从输入流读取一个字符。
 *     3、public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中。
 *二、继承子类FileReader类：
 *  1. 构造方法：
 *      1）、FileReader(File file)： 创建一个新的 FileReader ，给定要读取的**File对象**。
 *      2）、FileReader(String fileName)： 创建一个新的 FileReader ，给定要读取的文件的**字符串名称**。
 *  2. FileReader读取字符数据：
 *      **读取字符**：`read`方法，每次可以读取一个字符的数据，提升为int类型，读取到文件末尾，返回`-1`
 *三、字符输出流（Writer）：它是是字符输出流的抽象父类
 *  1. 字符输出流的基本共性功能方法：
 *       1)、void write(int c) 写入单个字符。
 *       2)、void write(char[] cbuf)写入字符数组。
 *       3)、 abstract void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *       4)、 void write(String str)写入字符串。
 *       5)、void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 *       6)、void flush()刷新该流的缓冲。
 *       7)、void close()关闭此流，但要先刷新它。
 * 2. 继承子类：FileWriter类：
 *    构造器：
 *        1)、FileWriter(File file)： 创建一个新的 FileWriter，给定要读取的File对象。
 *        2)、FileWriter(String fileName)： 创建一个新的 FileWriter，给定要读取的文件的名称。
 *   FileWriter写出数据：
 *       write(int b) 方法，每次可以写出一个字符数据
 *       void write(char[] cbuf)写入字符数组。
 *
 *
 *
 * */
public class IO_Reader_Writer {
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象
        File file = new File("F:\\自动创建的文件夹\\d.txt");
        FileReader fr = new FileReader(file);
        // 第二种方式：使用文件名称创建流对象
        FileReader fileReader = new FileReader("F:\\自动创建的文件夹\\d.txt");
        /**读取数据*/
        int b;
        char[] chs=new char[1024];
        while ((b=fileReader.read(chs))!=-1){
            System.out.println(new String(chs));
            //String(char [] ch)-->字符串有根据字符数组内容|byte数组内容创建字符串对象的构造器
        }
        //关闭
        fileReader.close();

        /**————————————————————————————向一个文件中写入数据——————————————————————————————————————*/
        //创建输出流对象
        FileWriter fw=new FileWriter("F:\\自动创建的文件夹\\e.txt",true);
        // 写出字符串
        fw.write("我是齐天大圣");
        // 写出换行
        fw.write("\n");
        // 写出字符串
        fw.write("孙悟空");
        fw.write("\n");
        // 刷出，关闭资源
        fw.flush();
        fw.close();
        /*把刚刚写入的数据读取出来*/
        //创建输入流对象
        FileReader reader=new FileReader("F:\\自动创建的文件夹\\e.txt");
        int i;// 定义变量，作为记录读取的数据的有效个数
        char[] ch=new char[1024];
        while ((i=reader.read(ch))!=-1){
            System.out.println(new String(ch));
        }
        reader.close();
    }


}
