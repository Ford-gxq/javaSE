package 网络编程.TCP协议.模拟多用户登陆;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
    多客户端登录:服务器端
        通过多线程实现
 */
public class LoginServer02 {
    //main测试主线程
    public static void main(String[] args) throws IOException {
        System.out.println("-----------------我是服务端------------------");
        //创建一个ServerSocket对象  1. ServerSocket定义服务端通讯接口
        ServerSocket  server=new ServerSocket(10000);
        //循环接收客户端的请求，循环做响应
        boolean flag = true;
        while (flag){
            //2.阻塞式监听
            Socket client = server.accept();
            System.out.println("一个客户端监听成功！");
            //开启线程对客户端做处理
            new Thread(new RequestResponse(client)).start();

        }
        //服务器端响应接口关闭
        server.close();
    }
 /**
  * 此处定义一个静态方法用于创建输入流读取客户端发送的数据，
    创建输出流向客户端响应结果
  */
    static  class RequestResponse implements Runnable{
     private Socket client;//定义一个成员变量套接字
     private DataInputStream   in=null;
     private DataOutputStream  out=null;

     //构造方法
     public RequestResponse(Socket client) {
         this.client = client;
         try {
             in=new DataInputStream(new BufferedInputStream(client.getInputStream()));
             out=new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     @Override
     public void run() {
         //3.获取输入流->读取客户端发送的数据
         //4.处理数据
         String msg = readData();
         /*分隔字符串获取到想要用户名与密码的值*/
         String username=null;
         String password = null;
         String [] arr=msg.split("&");
         username=arr[0];
         password=arr[1];

         //校验
         if("laopei".equals(username) && "1234".equals(password)){
             write("登录成功");
         }else{
             write("用户名或密码错误!!!");
         }
         //5.关闭
         close();

     }
     //读入数据的方法
     public String readData(){
     String msg=null;
         try {
             msg=in.readUTF();
         } catch (IOException e) {
             e.printStackTrace();
         }

         return msg;
     }

     //写出数据的方法
  public void write(String msg){
      try {
          out.writeUTF(msg);
          out.flush();
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

  //关闭输入输出流的方法
     public void close(){
         if(in!=null){
             try {
                 in.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             if(out!=null){
                 try {
                     out.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
             if(client!=null){
                 try {
                     client.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }

     }

 }


}
