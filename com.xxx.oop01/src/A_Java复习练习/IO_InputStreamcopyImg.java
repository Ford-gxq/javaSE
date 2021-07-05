package A_Java复习练习;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileInputStream复制一张图片
 *
 * */
public class IO_InputStreamcopyImg {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream in=new FileInputStream("F:\\自动创建的文件夹\\a.png");
        FileOutputStream out=new FileOutputStream("F:\\自动创建的文件夹\\b.png");
        int length;
        byte[] b=new byte[1024];
        while((length=in.read(b))!=-1){
            // 2.4 写出数据
            out.write(b, 0 , length);

        }
        // 3.输出并关闭资源
        in.close();
        out.flush();
        out.close();
    }

}
