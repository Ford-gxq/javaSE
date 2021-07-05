package A_Java复习练习;

import java.io.File;
import java.io.IOException;

/** File类：
 *    4个构造方法：
 *      File​(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
 *      File​(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 *      File​(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
 *      File​(URI uri) 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
 * 常用方法:
 * 一、获取文件路径
 *  1)public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 *  2)public String getPath() ：将此File转换为路径名字符串。
 *  3)public String getName() ：返回由此File表示的文件或目录的名称。
 *  4)public long length() ：返回由此File表示的文件的长度。
 *
 *  二、判断功能的方法：
 * 1、public boolean exists()：此File表示的文件或目录是否实际存在。
 * 2、public boolean isDirectory()：此File表示的是否为目录。
 * 3、public boolean isFile()：    此File表示的是否为文件。
 *  三、File类的目录和文件的增删操作
 *     public boolean   delete() | 删除由此抽象路径名表示的文件或目录
 *     public boolean createNewFile() ：文件不存在，创建一个新的空文件并返回true，文件存在，不创建文件并返回false。
 *     public boolean mkdir() ：创建由此File表示的目录。
 *     public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 * 四、目录的遍历
 *     public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
 *     public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
 * */
public class IO_File01_Demo1 {

    public static void main(String[] args) throws IOException {
        //三种常用构造方法
    //File的构造方法：1.File​(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例
        File f1= new File("F:\\IOtest\\fileTest","java.txt");
        System.out.println(f1);
    //File​(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
        File f2=new File("F:\\IOtest\\fileTest\\java1.txt");
        System.out.println(f2);
    //构造方法 3.File​(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
        File f3 = new File("F:\\IOtest");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);

     /**----------------------------------------------常用方法-------------------------------------------*/
        /**1.文件|目录路径和文件名等获取方法：*/
         //public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        File f = new File("F:\\IOtest\\fileTest\\HelloWorld.java");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");//返回文件内容的长度，字节数

        File file=new File("F:\\IOtest");
        System.out.println("目录绝对路径:"+file.getAbsolutePath());
        System.out.println("目录路径:"+file.getPath());
        System.out.println("目录名称:"+file.getName());
        System.out.println("目录长度:"+file.length());

        /**2.File类判断创建功能【应用】
         * 1、 public boolean exists()： 此File表示的文件或目录是否实际存在。
         * 2、 public boolean isDirectory()：此File表示的是否为目录。
         * 3、public boolean isFile()：     此File表示的是否为文件。
         *
         * */
        File f5 = new File("F:\\IOtest\\fileTest\\HelloWorld.java");
        File f6=new File("F:\\IOtest");
        System.out.println("判断此路径下的文件对象是否存在: "+f5.exists());//判断此路径下的文件对象是否存在
        System.out.println("判断次文件是否是目录："+f6.isDirectory());
        System.out.println("判断是否是文件："+f6.isFile());
     /**3. File类的目录和文件的增删操作【应用】
      *   public boolean   delete() | 删除由此抽象路径名表示的文件或目录
      *   public boolean createNewFile() ：文件不存在，创建一个新的空文件并返回true，文件存在，不创建文件并返回false。
      *   public boolean mkdir() ：创建由此File表示的目录。
      *   public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
      *
      * */
        // 文件的创建
        File file2= new File("F:\\aaa.txt");
      if(file2.exists()){//判断文件是否存在,若存在删除，不存在就创建
         file2.delete();
      }else {
          file2.createNewFile();
      }
        File d=new File("F:\\IOtest");
      if(d.exists()){//如果目录存在就删除，不存在就创建
          d.delete();
      }else {
          d.mkdir();
      }
     // 目录的创建
        File file3= new File("F:\\newDir");
        System.out.println("是否存在:"+file3.exists());// false
        System.out.println("是否创建:"+file3.mkdir());	// true
        System.out.println("是否存在:"+file3.exists());// true
    //创建多级目录
        // 创建多级目录
        File dir= new File("F:\\IOtest\\fileTest");
        System.out.println(dir.mkdir());// false
        File dirs=new File("F:\\IOtest\\fileTest\\haha");
        System.out.println(dirs.mkdirs());//true
     //文件的删除
        System.out.println(file2.delete());// true
        //录的删除
        System.out.println(dirs.delete());//返回true
       /**4. 目录的遍历
        * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        * */
      File dir1=new File("F:\\MarkDown笔记文件");
        //获取当前目录下的文件以及文件夹的名称
        String[] names=dir1.list();
        for(String name : names){ //获取的是文件名的字符串
            System.out.println(name);
        }
       //此方法返回的是File数组
        File[] files=dir1.listFiles();
       for(File fi: files){
           System.out.println(fi);//获取的每个元素是带路径的File对象
       }
    }

}
