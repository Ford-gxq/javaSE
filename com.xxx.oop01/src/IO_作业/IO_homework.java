package IO_作业;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1.练习题
 *  *        1)定义一个文件,xixi.txt
 *  * 	        文件中内容为:zhemejiandandoubuhui,shaleba,hahahhahaha,kuaixieba,xiebuwanbieshuile
 *  * 	        判断文件内容中a字符出现的次数
 *  *        2)     不使用系统提供的方法,把一个字符串翻转
 *  *        3)     通过IO流文件夹拷贝(包含文件夹中所有的子内容)
 *  *        4)     查资料->字符流与字节流之间的区别
 *  * 2.练习字节流,字符流的文件拷贝(熟练)
 *  * 3.笔记
 *  * 4.任务卡
 *  * 5.预习其他流与集合
 *
 * */
public class IO_homework {
    public static void main(String[] args) throws IOException {
    //创建一个File对象
        File file=new File("D:/xixi.txt");
        if (!file.exists()){
            file.createNewFile();
        }else {
            String sourceString = "zhemejiandandoubuhui,shaleba,hahahhahaha,kuaixieba,xiebuwanbieshuile";//待写入字符串
            int count=0;
            for (int i = 0; i <sourceString.length(); i++) {
                if(sourceString.charAt(i)=='a'){
                    count++;
                }
            }
            System.out.println("字符串中a出现的次数是："+count);
            byte[] sourceByte = sourceString.getBytes();
            //创建文件输入流对象
            FileOutputStream out=new FileOutputStream(file);//文件输出流用于将数据写入文件
            out.write(sourceByte);
            out.close();
        }
        System.out.println(reverseString("zhangsanxuejava"));
    }
    //2. 定义一个字符串反转的方法
    public  static  String reverseString(String input){
     String output=new String();
        for (int i = input.length()-1; i >=0; i--) {
         output+=input.charAt(i);
        }
        return output ;
    }



}
