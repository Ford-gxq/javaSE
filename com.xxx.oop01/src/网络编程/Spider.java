package 网络编程;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *网络爬虫: -->了解
 *         爬取淘宝页面的代码写到本地的index.html
 *
 * */
public class Spider {
    public static void main(String[] args) throws IOException {
        //1.定位页面资源
        URL  url=new URL("http://www.baidu.com");
        //2.获取流 打开与此 URL的连接并返回 InputStream以从该连接读取
        //创建一个输入流
        InputStream  is=url.openStream();//URL的对象url有一个openStream()方法获取一个输入流对象
        //转换流: 字节输入流->转为->字符输入流   InputStreamReader(InputStream in)
        BufferedReader rd=new BufferedReader(new InputStreamReader(is,"utf-8"));
        FileOutputStream fo=new FileOutputStream("D:/baidu.html");
        //读取并写入数据
         String msg=null;
         byte[] bytes=null;
        while ((msg=rd.readLine())!=null){
            bytes=msg.getBytes();
            fo.write(bytes);
        }
      //关闭流
        fo.flush();
        fo.close();
        rd.close();
    }
}
