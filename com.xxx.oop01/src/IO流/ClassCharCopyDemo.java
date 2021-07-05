package IO流;

import java.io.*;

/**
    通过字符流实现文件拷贝
        1.构建流
        2.读入写出
        3.刷出
        4.关闭
 */
public class ClassCharCopyDemo {
    public static void main(String[] args) throws IOException {
        //        1.构建流
        Reader rd = new FileReader("D://haha.txt");
        Writer rw = new FileWriter("D://houhou.txt");
        //        2.读入写出
        char[] car = new char[1024];
        int len = -1;

        while((len=rd.read(car))!=-1){
            rw.write(car,0,len);
        }

        //        3.刷出
        rw.flush();
        //        4.关闭
        rw.close();
        rd.close();
    }
}
