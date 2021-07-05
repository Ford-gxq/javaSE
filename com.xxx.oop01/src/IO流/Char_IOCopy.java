package IO流;

import java.io.*;

/**
    通过字符流实现文件拷贝
        1.构建流
        2.读入写出
        3.刷出
        4.关闭
     异常捕获
 */
public class Char_IOCopy{
    public static void main(String[] args) {
        //        1.构建流
        Reader rd = null;
        Writer rw = null;
        try {
            rd = new FileReader("D://haha.txt");
            rw= new FileWriter("D://houhou.txt");
            //        2.读入写出
            char[] car = new char[1024];
            int len = -1;

            while((len=rd.read(car))!=-1){
                rw.write(car,0,len);
            }

            //        3.刷出
            rw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        4.关闭
            if(rw!=null){
                try {
                    rw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(rd!=null){
                try {
                    rd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
