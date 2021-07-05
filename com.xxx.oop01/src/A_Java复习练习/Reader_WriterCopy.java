package A_Java复习练习;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @拷贝文件
 * */
public class Reader_WriterCopy {

    public static void main(String[] args) throws IOException {
        //创建输入流对象
        //文件不存在会抛出java.io.FileNotFoundException
        FileReader fr=new FileReader("F:\\自动创建的文件夹\\e.txt");
        //创建输出流对象
        FileWriter fw=new FileWriter("F:\\自动创建的文件夹\\copyFile.txt");
        /*创建输出流做的工作：
         *      1、调用系统资源创建了一个文件
         *      2、创建输出流对象
         *      3、把输出流对象指向文件
         * */
        //文本文件复制，一次读一个字符
        copyMethod1(fr, fw);
        //文本文件复制，一次读一个字符数组
        copyMethod2(fr, fw);
        fw.close();
        fr.close();
    }
    //定义一个一次读取一个字符的copy方法
    private static void copyMethod2(FileReader fr, FileWriter fw) throws IOException {
        int ch;//定义一个变量用于记录读取的有效数据的个数
        while((ch=fr.read())!=-1) {//读数据
            fw.write(ch);//写数据
        }
        fw.flush();

    }

    //定义一个一次可以读取一个字符数组的copy方法
    private static void copyMethod1(FileReader fr, FileWriter fw) throws IOException {
      int ch;
      char[] chars=new char[1024];
      while ((ch=fr.read(chars))!=-1){
          fw.write(chars);
      }
      fw.flush();

    }


}
