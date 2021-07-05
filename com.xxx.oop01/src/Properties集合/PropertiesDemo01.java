package Properties集合;

import java.io.IOException;
import java.util.Properties;
/**
    Properties类:
      Properties类表示一组持久的属性。 Properties可以保存到流中或从流中加载。 属性列表中的每个键及其对应的值都是一个字符串。
      Object    setProperty​(String key, String value)   调用 Hashtable方法put。返回的是一个键值对的字符串对象
      String    getProperty​(String key) 在此属性列表中搜索具有指定键的属性。  返回的是一个字符串
 常常作为配置文件类型使用
       1.定义xx.properties文件,定义键值对类型的数据
       2.构建Properties对象,从流中加载
       3.根据key获取value的值
 */
public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
        //new一个Properties对象--->注意此处不可加泛型
        Properties pro=new Properties();
        pro.setProperty("UersName","张三");
        pro.setProperty("password","123abc");
        System.out.println(pro.getProperty("UersName"));
        System.out.println(pro.getProperty("password"));
        //void load(InputStream inStream) 从输入字节流中读取属性列表（键和元素对）。
        pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));

        //从配置文件中读取数据
        System.out.println(pro.getProperty("userName"));
        System.out.println(pro.getProperty("password"));

    }
}
