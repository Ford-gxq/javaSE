package A_Java复习练习.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *一、网络编程三要素:
 *   IP地址:
 *       要想让网络中的计算机能够互相通信，必须为每台计算机指定一个标识号，
 *       通过这个标识号来指定要接收数据的计算机和识别发送的计算机，而IP地址就是这个标识号。也就是设备的标识
 *   端口:
 *       网络的通信，本质上是两个应用程序的通信。每台计算机都有很多的应用程序，那么在网络通信时，
 *       如何区分这些应用程序呢？如果说IP地址可以唯一标识网络中的设备，那么端口号就可以唯一标识设备中的应用程序了。
 *       也就是应用程序的标识
 *   协议:
 *      通过计算机网络可以使多台计算机实现连接，位于同一个网络中的计算机在进行连接和通信时需要遵守一定的规则，
 *      这就好比在道路中行驶的汽车一定要遵守交通规则一样。
 *      在计算机网络中，这些连接和通信的规则被称为网络通信协议，它对数据的传输格式、传输速率、传输步骤等做了统一规定，
 *      通信双方必须同时遵守才能完成数据交换。常见的协议有UDP协议和TCP协议
 * 二、InetAddress【应用】
 *   1. InetAddress：此类表示Internet协议（IP）地址
 *        注意：--->InetAddress对象，无构造函数，有非静态方法，通过其静态方法返回实例对象
 *      相关方法：
 *          | static InetAddress getByName(String host) | 确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
 *          | String getHostName()                      | 获取此IP地址的主机名
 *          | String getHostAddress()                   | 返回文本显示中的IP地址字符串
 *三、常用的网络协议，UDP协议、TCP协议
 * - UDP协议
 *         - 用户数据报协议(User Datagram Protocol)
 *         - UDP是无连接通信协议，即在数据传输时，数据的发送端和接收端不建立逻辑连接。简单来说，
 *             当一台计算机向另外一台计算机发送数据时，发送端不会确认接收端是否存在，就会发出数据，同样接收端在收到数据时，
 *             也不会向发送端反馈是否收到数据。
 *         - 由于使用UDP协议消耗系统资源小，通信效率高，所以通常都会用于音频、视频和普通数据的传输
 *         - 例如视频会议通常采用UDP协议，因为这种情况即使偶尔丢失一两个数据包，也不会对接收结果产生太大影响。
 *            但是在使用UDP协议传送数据时，由于UDP的面向无连接性，不能保证数据的完整性，因此在传输重要数据时不建议使用UDP协议
 * - TCP协议
 *   - 传输控制协议 (Transmission Control Protocol)
 *      1)- TCP协议是面向连接的通信协议，即传输数据之前，在发送端和接收端建立逻辑连接，然后再传输数据，
 *        它提供了两台计算机之间可靠无差错的数据传输。在TCP连接中必须要明确客户端与服务器端，由客户端向服务端发出连接请求，
 *        每次连接的创建都需要经过“三次握手”
 *      2)- 三次握手：TCP协议中，在发送数据的准备阶段，客户端与服务器之间的三次交互，以保证连接的可靠
 *               第一次握手，客户端向服务器端发出连接请求，等待服务器确认
 *               第二次握手，服务器端向客户端回送一个响应，通知客户端收到了连接请求
 *               第三次握手，客户端再次向服务器端发送确认信息，确认连接
 *   -           完成三次握手，连接建立后，客户端和服务器就可以开始进行数据传输了。由于这种面向连接的特性，
 *               TCP协议可以保证传输数据的安全，所以应用十分广泛。例如上传文件、下载文件、浏览网页等
 * */
public class InetAddress_Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        //注意InetAddress类无构造参数，通过静态方法返回实例对象
        InetAddress address=InetAddress.getByName("www.baidu.com");
        //public String getHostName()：获取此IP地址的主机名
        String name = address.getHostName();
        //public String getHostAddress()：返回文本显示中的IP地址字符串
        String ip =address.getHostAddress();
        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);
    }

}
