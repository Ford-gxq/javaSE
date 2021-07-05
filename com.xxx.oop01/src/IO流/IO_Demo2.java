package IO流;

import java.io.*;

/**
    字节输出流
        OutputStream 字节输出流
            它的子实现类 FileOutputStream 文件字节输出流
    注意: 如果目的地文件不存在,会自动帮你构建文件,不是文件夹
 */
public class IO_Demo2 {
    public static void main(String[] args) throws IOException {
        //1.与文件建立联系
        File file=new File("D:/dest.txt");
       //2.构建输出流
        OutputStream out=new FileOutputStream(file);
        //3.写出
        int i=97;
        String str="hahanihao";
        out.write(i);// out输出流对象.write()--->void write​(int b) 将指定的字节写入此文件输出流。
            //out--->void write​(byte[] b) 将指定字节数组中的 b.length字节写入此文件输出流
        out.write(str.getBytes());

        //4.刷出
       out.flush();
        //5.关闭
        out.close();



    }

}
