package IO_缓冲流_数据流_对象流;

import java.io.*;

/**
   缓冲流 -->  功能流(节点流)
    加快节点流的读写效率,提高性能
        字节缓冲流 :
            输入流的缓冲流 : BufferedInputStream
            输出流的缓冲流 : BufferedOutputStream
 */
public class Buffered_InputStream {
    public static void main(String[] args) throws IOException {
        //缓冲流->文件输入流
        InputStream in=new BufferedInputStream(new FileInputStream("D://haha.txt"));
        OutputStream os=new BufferedOutputStream(new FileOutputStream("D//heixhei.txt"));
    //拷贝
        byte [] arr=new byte[1024*1024];
        int len=-1;
        while ((len=in.read(arr))!=-1){
            os.write(arr,0,len);
        }
        //刷出
        os.flush();
        //关闭
        os.close();
        in.close();
    }

}
