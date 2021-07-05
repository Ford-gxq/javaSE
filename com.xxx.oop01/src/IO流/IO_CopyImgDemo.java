package IO流;

import java.io.*;

public class IO_CopyImgDemo {
    public static void main(String[] args) throws IOException {
        //创建流对象
//        File file =new File("D://tu.png");
//        System.out.println(file.exists());
        FileInputStream  inp=new  FileInputStream("D://图片.png");
        FileOutputStream out=new FileOutputStream("D://图片2.png");

        //2.读取数据---写入数据
        byte [] cs=new byte[1024];
        int len=-1;//记录每次读入到数组中数据的个数
        while((len=inp.read(cs))!=-1){
            out.write(cs,0,len);
        }
        out.flush();
        //关闭
        inp.close();
        out.close();


    }
}
