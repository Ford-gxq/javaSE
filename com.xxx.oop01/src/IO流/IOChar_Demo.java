package IO流;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
    字符流: 只能读写纯文本的数据
        Reader  FileReader 字符文件输入流
        Writer FileWriter  字符文件输出流
 */
public class IOChar_Demo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
       Reader rd=new FileReader("D:haha.txt");
       //读入数据
        System.out.println((char)rd.read());
        System.out.println((char)rd.read());
        System.out.println((char)rd.read());

        //定义一个字符数组用于存储拷贝过来的数据
        char [] chs=new char[1024];
        int len=-1;//记录每次读入到数组中数据的个数
        while((len=rd.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
      //关闭
        rd.close();
    }

}
