package IO_缓冲流_数据流_对象流;

import java.io.*;

/**
    Data流|基本数据类型流|数据流-->功能流-->字节流
        保留数据+基本数据类型+String
    DataInputStream   新增功能: read数据类型();  readInt(int i)
    DataOutputStream  新增功能: write数据类型();  WriteInt()
    注意:
        读入与写出的顺序保持一致
        EOFException 读入的文件应该是源文件(写出的文件)
 */
public class DataInputStream_example {
    public static void main(String[] args) throws IOException {
    WriteData("D:xxx.txt");
    ReadData("D:xxx.txt");
    }
    //定义一个写数据的静态方法
    public static void  WriteData(String dest) throws IOException {
        //创建数据输出流对象
        DataOutputStream  ds=new DataOutputStream(new FileOutputStream(dest));
        //定义要写入的数据
        int i=123;
        float f=1;
        double d=1.2;
        boolean b=false;
        char ch='a';
        String str="哈哈哈哈哈啦啦啦";
        //写入数据
        ds.writeInt(i);
        ds.writeFloat(f);
        ds.writeDouble(d);
        ds.writeBoolean(b);
        ds.writeChar(ch);
        ds.writeUTF(str);
        //写入数据完毕刷出并关闭输出流
        ds.flush();
        ds.close();

    }
  //定义一个读取数据的静态方法
    public static void ReadData(String src) throws IOException {
        //创建输入流对象
        DataInputStream di=new DataInputStream(new FileInputStream(src));
        //读取对应的数据类型的数据-->
        int i=di.readInt();
        float f=di.readFloat();
        double d=di.readDouble();
        boolean b=di.readBoolean();
        char ch= di.readChar();
        String str=di.readUTF();
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(str);
        //关闭
        di.close();

    }

}
