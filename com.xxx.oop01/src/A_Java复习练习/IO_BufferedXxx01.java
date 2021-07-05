package A_Java复习练习;

import java.io.*;

/**  通过大文件拷贝测试缓冲流的比普通流的效率：
 *
 缓冲流: 4个`FileXxx` 流的“增强流”
 -        字节缓冲流：`BufferedInputStream`，`BufferedOutputStream`
 -        字符缓冲流：`BufferedReader`，`BufferedWriter`
 *1.1 字节缓冲流
 *     构造方法:
 *        public BufferedInputStream(InputStream in)：创建一个新的缓冲输入流，注意参数类型为InputStream。
 *        public BufferedOutputStream(OutputStream out)： 创建一个新的缓冲输出流，注意参数类型为OutputStream。
 *
 * */
public class IO_BufferedXxx01 {
    public static void main(String[] args) throws IOException {
     /*
      * //构造方式一： 创建字节缓冲输入流【但是开发中一般常用下面的格式申明】
      * FileInputStream fps = new FileInputStream(b.txt);
      * BufferedInputStream bis = new BufferedInputStream(fps)
      * //构造方式一： 创建字节缓冲输入流
      * BufferedInputStream bis = new BufferedInputStream(new FileInputStream("b.txt"));
      * ///构造方式二： 创建字节缓冲输出流
      * BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
      *
      * */
      //---------------------------------测试感受缓存流的高效------------------------------------------//
      //缓冲流读写方法与基本的流是一致的，我们通过复制300多MB的大文件，测试它的效率。
        FileInputStream in=new FileInputStream("F:\\PsycheEpic Setup 0.3.6.exe");
        FileOutputStream out=new FileOutputStream("D:\\copyPs.exe");
        copyFile(in,out);
        BufferCopyFile(new BufferedInputStream(in),new BufferedOutputStream(out));
        out.close();
        in.close();
    }
   //定义一个基本流的copy方法
    public static void copyFile(FileInputStream in, FileOutputStream out) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        int len;
        byte[] bytes=new byte[1024*1024];//定义一个数组用于存放接收数据
        while ((len=in.read(bytes))!=-1){
           out.write(bytes,0,len);
        }
        out.flush();
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:"+(end - start)+" 毫秒");
    }
    //定义一个高效缓冲流copy方法
    public  static void BufferCopyFile(BufferedInputStream bin,BufferedOutputStream bout) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        int len;
        byte[] bytes=new byte[1024*1024];//定义一个数组用于存放接收数据
        while ((len=bin.read(bytes))!=-1){
            bout.write(bytes);
        }
        bout.flush();
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:"+(end-start)+" 毫秒");

    }

}
