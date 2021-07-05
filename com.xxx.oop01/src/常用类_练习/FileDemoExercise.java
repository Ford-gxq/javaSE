package 常用类_练习;

import javax.script.ScriptContext;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileDemoExercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查询文件的盘符：");
        String  path=sc.nextLine();
        File file=new File(path);

        //File[] listFiles() 返回一个抽象路径名数组，表示此抽象路径名表示的目录中的文件。
        File []  dirs=file.listFiles();
        for (int i = 0; i <dirs.length; i++) {
          //  System.out.println(dirs[i]);
            //long lastModified() 返回上次修改此抽象路径名表示的文件的时间。
           // boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。-->
          String date=  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));

        }

    }


}
