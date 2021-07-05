package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
    IO:流
       作用：上传下载   读入写出
    流: 流就是管道
        数据以先入先出的方式在流中存储
        数据的源头    -->       目的地
        以程序为中心(大脑)
    流的分类:
        流向分:
            输入流
            输出流
        操作单元:
            字节流 : 万能流
            字符流 : 只能传输纯文本的内容
        功能分:
            节点流 : 真实做读入写出功能的是节点流
            功能流 : 增强节点的性能,加快读写效率
        分类之间是相辅相成
    字节流:
        InputStream  字节输入流
        FileInputStream 文件字节输入流

 */
public class IO_Demo01 {
    public static void main(String[] args) throws IOException {
    //1.与文件建立联系
        File file=new File("D://heihei.txt");
        if(!file.exists()){
            file.createNewFile();
        }
    //2.构建流  FileInputStream(File file)
        FileInputStream in=new FileInputStream(file);

    //3.读入数据  read() 每次读入一个字节的数据
         int num=in.read();

    //4.处理数据
        System.out.println(num);
        System.out.println((char)num);
        System.out.println((char)(in.read()));
        System.out.println((char)(in.read()));
   /**
    * 使用while循环读取数据，先定义一个变量用于表示读取的状态
    * */
     int num1=-1;
     while ((num1=in.read())!=-1){
         System.out.println((char) num1);
     }

    //5.关闭
    in.close();
    }



}
