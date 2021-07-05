package A_Java复习练习;

import java.io.*;

/**
 * 字符缓冲流
 *   构造方法：
 *       public BufferedReader(Reader in) ：创建一个新的缓冲输入流，注意参数类型为Reader。
 *       public BufferedWriter(Writer out)： 创建一个新的缓冲输出流，注意参数类型为Writer。
 *  字符缓冲流特有方法：
 *       - BufferedReader：`public String readLine()`: **读一行数据**。 读取到最后返回null
 *       - BufferedWriter：`public void newLine()`: **换行**,由系统属性定义符号。
 * */
public class IO_BufferedReader {
    public static void main(String[] args) throws IOException {
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("F:\\自动创建的文件夹\\d.txt"));
        // 定义字符串,保存读取的一行文字
        String line  = null;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
            System.out.print(line);
            System.out.println("--------------------------------");
        }
        // 释放资源
        br.close();
    /**-------------------------------换行读----------------------------------*/

        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\test1.txt"));
        // 写出数据
        bw.write("刘亦菲");
        // 写出换行
        bw.newLine();
        bw.write("我的");
        bw.newLine();
        bw.write("女神");
        bw.newLine();
        // 释放资源
        bw.close();

    }

}
