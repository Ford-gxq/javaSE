package 常用类_练习;

import java.io.File;
import java.io.IOException;

public class File_Exercise {

    public static void main(String[] args) throws IOException {
        // 创建一个File对象
        File file=new File("D://test.txt");
        System.out.println(file);
    // boolean exists() 测试此抽象路径名表示的文件或目录是否存在。
        System.out.println(file.exists());//返回false表示这个路径下的test.text文件不存在
        // File getAbsoluteFile() 返回此抽象路径名的绝对形式
        File file1=new File("D:/AAA/BBB/test.txt");
        System.out.println(file1.getAbsolutePath());//表示返回的是文件的绝对路径
        System.out.println(file1.getAbsoluteFile());//表示返回的是文件对象
       File file3=new File("E://text.txt");
        //boolean createNewFile() 当且仅当具有此名称的文件尚不存在时，以原子方式创建由此抽象路径名命名的新空文件。
        System.out.println(file3.createNewFile());//返回true表示文件不存在且创建成功！

        //boolean delete() 删除此抽象路径名表示的文件或目录。
        System.out.println(file3.delete());
        //boolean exists() 测试此抽象路径名表示的文件或目录是否存在。

        if (!file3.exists()){
            System.out.println(file3.createNewFile());

        }else {
            System.out.println("文件已经存在！！");
        }
        //File getParentFile() 返回此抽象路径名父项的抽象路径名，如果此路径名未指定父目录，则返回 null。
       File file4=new File("E:/AAA");
        //File[] listFiles​(FilenameFilter filter) 返回一个抽象路径名数组，表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。


    }

}
