package Xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;
import java.util.List;

public class ParseXml_Demo01 {

    public static void main(String[] args) throws DocumentException {
   traversal(getDocument("com.xxx.oop01/OopDemo01/src/person.xml"));

    }
 /**
    获取Document对象
 */
 public static Document getDocument(String path) throws DocumentException {
     //1.需要通过SAXReader流加载XML文件
     SAXReader rd = new SAXReader();
     //2.获取Document文件
     Document document = rd.read(path);
    return  document;

 }
  /**
    遍历
  */
  public  static void traversal(Document document){
      //3.获取根节点
      Element rootElement = document.getRootElement();
      //4.获取根节点中的子节点
      List<Element> list = rootElement.elements();
      list.stream().forEach(
              element -> {
                  System.out.println(element.getName() + "--->" + element.attributeValue("id"));
                  //遍历元素->name,age..
                  Iterator<Element> it = element.elementIterator();
                  while (it.hasNext()){
                      Element ele = it.next();
                      System.out.println(ele.getName()+"----->"+ele.getData());

                  }
              });
  }

}
