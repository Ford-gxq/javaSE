package homework_5_18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * 一个java文件中读取数据,分析每个字符出现的次数,结果存储到文件中
 * 	文件: zhoumolahahaha,lazijiliaojieyixia,daimadoubuhuijiubiewanyouxila
 * */
public class Example4 {
    public static void main(String[] args) throws IOException {
        recordCount();

    }
 public static void recordCount() throws IOException {
     FileReader fr=new FileReader("D://count.txt");
     FileWriter fw=new FileWriter("D://result.txt");
     int count=0;
     HashMap<Character,Integer> map=new HashMap<>();
     //遍历读取文件
     while((count= fr.read())!= -1){//fr.read()，读取的字符的数量
         char ch = (char)count;//把接收到的字符包装类转换成字符
         if(!map.containsKey(ch)){//判断集合中是否包含该字符的键，如果不包含就添加
             map.put(ch,1);
         }else{//包含的话就覆盖，value值就加1-->此处的value值是Integer，根据每一个字符获取key值获取
             map.put(ch,map.get(ch) +1);
         }
         for(Character key : map.keySet()){
             fw.write(key + "="+ map.get(key) +"\t");
         };

     }
     fw.flush();
     fw.close();
     fr.close();

     }

}

