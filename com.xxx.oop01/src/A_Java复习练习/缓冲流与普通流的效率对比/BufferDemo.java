package A_Java复习练习.缓冲流与普通流的效率对比;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
        try{
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\PsycheEpic Setup 0.3.6.exe"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:copyPES.exe"));
            // 读写数据
            int b;
            byte[] bytes=new byte[1024*1024];//定义一个数组用于存放接收数据
            while ((b = bis.read(bytes)) != -1) {
                bos.write(bytes);
                bos.flush();
            }
            bos.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:"+(end - start)+" 毫秒");
    }
}