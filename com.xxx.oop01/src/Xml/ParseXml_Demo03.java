package Xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 通过dom4j解析xml文件
 1.需要通过SAXReader流加载XML文件
 2.获取Document文件
 3.遍历
 */
public class ParseXml_Demo03 {
    public static void main(String[] args) throws DocumentException, IOException {
        //writeToFile(modify(getDocument("src/persons.xml")),"src/persons.xml");
        writeToFile(removeEle(getDocument("src/persons.xml")),"src/persons.xml");
    }

    //删除: 父节点.remove(子节点)
    public static Document removeEle(Document document){
        Element root = document.getRootElement();
        Element e = root.element("Teacher");
        //删除
        root.remove(e);
        return document;
    }

    /**
        创建于添加
     */
    public static Document createDocument(){
        //1.创建一个Document对象
        Document document = DocumentHelper.createDocument();
        //2.添加节点 根节点
        Element root = document.addElement("Books");
        //3.添加子节点
        Element book1 = root.addElement("Book");
        Element book2 = root.addElement("Book");

        book1.addElement("name").addText("坏蛋是怎样练成的");
        book1.addElement("price").addText("1000");

        book1.addAttribute("id","101");
        book2.addAttribute("id","102");

        book2.addElement("name").addText("钢铁是怎样练成的");
        book2.addElement("price").addText("2000");

        return document;
    }

    //写出到源文件
    public static void writeToFile(Document document,String path) throws IOException {
        //1.创建流  XMLWrite()
        //2.创建输出的格式
        //OutputFormat format = OutputFormat.createCompactFormat();
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter wt = new XMLWriter(new FileWriter(path),format);
        //3.写出
        wt.write(document);
        //4.刷出
        wt.flush();
        //5.关闭
        wt.close();
    }

    //修改
    //修改标签名.标签对的内容
    public static Document modify(Document  document){
        Element root = document.getRootElement();
        //获取指定的某一个子节点
        Element stu = root.element("Student");
        stu.setName("Teacher");
        System.out.println("父标签名字:   "+stu.getName());
        List<Element> list = stu.elements();
        for(Element ele:list){
            if("name".equals(ele.getName())){
                ele.setText("李老板!!!");
            }
            System.out.println(ele.getName()+"-->"+ele.getText());
        }
        return document;
    }

    /**
        遍历
     */
    public static void print(Document document){
        //3.获取根节点
        Element root = document.getRootElement();
        //4.获取根节点中的子节点
        List<Element> list = root.elements();
        list.stream().forEach(element -> {
            System.out.println(element.getName()+"--->"+element.attributeValue("id"));
            //遍历元素->name,age..
            Iterator<Element> it =  element.elementIterator();
            while(it.hasNext()){
                Element ele = it.next();
                System.out.println(ele.getName()+"----->"+ele.getData());
            }
        });
    }


    /**
        获取Document对象
     */
    public static Document getDocument(String path) throws DocumentException {
        //1.需要通过SAXReader流加载XML文件
        SAXReader rd = new SAXReader();
        //2.获取Document文件
        Document document = rd.read(path);
        return document;
    }
}
