package A_Java复习练习.缓冲流与普通流的效率对比;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Input_OutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
        try {
                FileInputStream fis = new FileInputStream("F:\\PsycheEpic Setup 0.3.6.exe");//exe文件够大
                FileOutputStream fos = new FileOutputStream("D:copyPES.exe");
            // 读写数据
            int b;
            byte[] bytes=new byte[1024*1024];//定义一个数组用于存放接收数据
            while ((b = fis.read(bytes)) != -1) {
                fos.write(bytes);
                fos.flush();
            }
             fos.close();
             fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:"+(end - start)+" 毫秒");
    }
}