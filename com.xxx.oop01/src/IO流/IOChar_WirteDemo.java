package IO流;

import java.io.*;

/**
 字符流: 只能读写纯文本的数据
 Reader  FileReader 字符文件输入流
 Writer FileWriter  字符文件输出流
 */
public class IOChar_WirteDemo {

    public static void main(String[] args) throws IOException {
      //创建流对象
      Reader rd=new FileReader("D:/haha.txt");
      Writer wd=new FileWriter("D:/dest1.txt");
      //读数据--写数据
        char [] chs=new char[1024];
        int len=-1;
        while ((len=rd.read(chs))!=-1){
            wd.write(chs);
        }
      //刷出
        wd.flush();
        //关闭
        wd.close();
        rd.close();
    }
}
