package A_Java复习练习.网络编程.TCP.模拟用户登陆;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.DoubleToIntFunction;

public class LoginServer01 {

    public static void main(String[] args) throws IOException {
      // 1.ServerSocket 定义服务端 ServerSocket(int port) 创建绑定到指定端口的服务器套接字。
        ServerSocket server=new ServerSocket(8888);
     // 2.阻塞式监听 Socket accept()-->服务器套接字类对象的接收方法
          Socket client=server.accept();
        System.out.println("一个客户端连接成功!");
    // 3.获取输入流--->读取客户端发送的数据
        DataInputStream din=new DataInputStream(new BufferedInputStream(client.getInputStream()));
         String data=din.readUTF();
        System.out.println(data);
   // 4.处理数据
        /*分隔字符串获取到想要用户名与密码的值*/
        String username=null;
        String passeword=null;
        //zhangsan&1234
        String[] arr=data.split("&");
        username=arr[0];
        passeword=arr[1];
        //校验
        if ("zhangsan".equals(username)&& "123456".equals(passeword)){
            System.out.println("登陆成功！");
        }else{
            System.out.println("用户名或密码错误！");
        }

        // 5.关闭输入流、客户端、服务器端
        din.close();
        client.close();
        server.close();

    }

}
