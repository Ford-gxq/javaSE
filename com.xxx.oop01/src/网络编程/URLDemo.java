package 网络编程;
/**
    url : 统一资源定位符
    互联网三大基石:
        url  html  http
    组成:
        http://www.baidu.com:80/index.html?username=zhangsan&password=1234#a
        协议 :http
        域名 :www.baidu.com
        端口 :80
        资源 :/index.html?username=zhangsan&password=1234#a
    URL 类URL表示统一资源定位符，指向万维网上的“资源”的指针。
 */

import java.net.MalformedURLException;
import java.net.URL;

/**
URL，类-->构造器 描述
        URL​(String spec) 从 String表示创建 URL对象。
        URL​(String protocol, String host, int port, String file) 创建 URL从指定对象 protocol ， host ， port号和 file 。
        URL​(String protocol, String host, int port, String file, URLStreamHandler handler) 创建 URL从指定对象 protocol ， host ,port数file和handler 。
        URL​(String protocol, String host, String file) 根据指定的 protocol名称， host名称和 file名称创建URL。
        URL​(URL context, String spec) 通过解析指定上下文中的给定规范来创建URL。
        URL​(URL context, String spec, URLStreamHandler handler) 通过使用指定上下文中的指定处理程序解析给定规范来创建URL。


 */
//URL的一些常用方法：
/**
 *    String getHost() 获取此 URL的主机名（如果适用）。
 *    String getFile() 获取此 URL的文件名。
 *    String getProtocol() 获取此 URL的协议名称。
 *    String getQuery() 获取此 URL的查询部分。
 *    String getRef() 获取此 URL的锚点（也称为“引用”）。
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
//    创建一个URL对象
        URL url = new URL("http://www.baidu.com:80/index.html?username=zhangsan&password=1234#a");
        //String getHost() 获取此 URL的主机名（如果适用）。
        System.out.println(url);
        System.out.println(url.getProtocol());//获取协议
        System.out.println(url.getHost());//获取主机
        System.out.println(url.getPort());//获取端口号
        System.out.println(url.getFile());
        System.out.println(url.getRef());



    }
}
