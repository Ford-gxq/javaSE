package 常用类的学习;

import java.io.File;

/**
  File 类
     文件或者目录的抽象表现形式
 */
public class Class07_File {
    public static void main(String[] args) {
        /**
        File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
        File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
         */
        File file = new File("test.txt");
        File file2 = new File("D:/test.txt");
        File file3 = new File("D:\\AAA\\test.txt");
        File file4 = new File("D:\\AAA");
        File file5 = new File("D:\\","AAA\\test.txt");
        File file6 = new File(file4,"test.txt");
        System.out.println(file);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);
        System.out.println(file5);
        System.out.println(file6);
    }
}

