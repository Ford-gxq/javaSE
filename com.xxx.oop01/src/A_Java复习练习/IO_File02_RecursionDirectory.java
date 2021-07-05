package A_Java复习练习;
import java.io.File;
import java.io.IOException;
/**
 * 递归遍历文件目录
 * */
public class IO_File02_RecursionDirectory {

    public static void main(String[] args) throws IOException {
        File file=new File("F:\\MarkDown笔记文件");
        Recursion(file);


    }

    private static void Recursion(File file) {
     //1、判断进入的是否是目录
        if(!file.isDirectory()){
            //不是目录直接退出
            return;
        }
        //已经确保了进入的file是目录
        File[] files=file.listFiles();//返回一个File对象数组
        //遍历files
        for(File fs : files){

        //如果该目录下文件还是个文件夹就再进行递归遍历其子目录
            if(fs.isDirectory()){
             Recursion(fs);
            }else {
                //如果该目录下文件是个文件，则打印对应的名字
                System.out.println(fs.getName());
            }
        }
    }

}
