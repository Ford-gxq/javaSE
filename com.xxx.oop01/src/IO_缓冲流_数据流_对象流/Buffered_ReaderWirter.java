package IO_缓冲流_数据流_对象流;

import java.io.*;

/**
   缓冲流 -->  功能流(节点流)
    加快节点流的读写效率,提高性能

    字符流缓冲流
        BufferedReader  新增功能 : String readLine() 读一行文字。  -->如果没有读到返回null
        BufferedWriter  新增功能 : void newLine() 写一个行分隔符。
    注意: 不能多态

 */
public class Buffered_ReaderWirter {
    public static void main(String[] args) throws IOException {
         //此处注意要使用子类BufferedReader的方法 String readLine()读取一行文字---没有读到返回null  因此此处不能使用多态
        // 缓冲流->文件输入流
        BufferedReader  rd=new BufferedReader(new FileReader("D://haha.txt"));
        BufferedWriter  bw=new BufferedWriter(new FileWriter("D://ppp.txt"));
        //拷贝
        String str=null;
        while ((str=rd.readLine())!=null){
         bw.write(str);
         bw.newLine();
        }
        //刷出
        bw.flush();
        //关闭
        bw.close();
        rd.close();
    }

}
