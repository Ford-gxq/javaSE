package 网络编程.TCP协议.练习_模拟用户登陆;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TowWayLoginServer01 {
    public static void main(String[] args) throws IOException {
        System.out.println("------------我是服务端---------------");
        // 1.ServerSocket定义服务端, 构造方法ServerSocket(int port) 创建绑定到指定端口的服务器套接字。

            ServerSocket  server=new ServerSocket(9000);
            // 2.阻塞式监听Socket accept()-->服务器套接字类对象的接收方法
            //Socket accept() 侦听对此套接字的连接并接受它。
            Socket client=server.accept();
            System.out.println("一个客户端连接成功!");
        // 3.创建输入流--->读取客户端发送的数据
        DataInputStream in=new DataInputStream(new BufferedInputStream(client.getInputStream()));
        String str=in.readUTF();
        System.out.println(str);
        // 4.处理数据
        /*分隔字符串获取到想要用户名与密码的值*/
          String username=null;
          String password=null;
          String [] arr=str.split("&");
          username=arr[0];
          password=arr[1];

        //创建输出流对象-->向客户端响应结果
        /**  DataOutputStream--->数据输出流允许应用程序以可移植的方式将原始Java数据类型写入输出流。
         *构造方法：
         *    DataOutputStream​(OutputStream out) 创建新数据输出流以将数据写入指定的基础输出流。
         *
         * */
        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        //服务器端校验
        if("peixin".equals(username)&& "1234".equals(password)){
            out.writeUTF("登陆成功！");
        }else{
            out.writeUTF("账户或密码错误！");
        }

        //刷出
      out.flush();
        //关闭
       out.close();
       in.close();
       client.close();
    }
}
