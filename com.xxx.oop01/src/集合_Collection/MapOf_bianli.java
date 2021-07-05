package 集合_Collection;

import java.util.*;

/**
 *Map 遍历
 *        Collection<V> values() 返回此映射中包含的值的Collection集合。
 *         Set<K> keySet()   获取所有的key,根据key获取value
 *         Set<Map.Entry<K,V>> entrySet()
 *             K getKey() 返回与此条目对应的键。
 *             V getValue()

* */

public class MapOf_bianli {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("章泽天",25);
        map1.put("刘亦菲",26);
        map1.put("王菲",46);
        map1.put("谢霆锋",28);
        //遍历方法1. 使用 values()方法变量映射---> Collection<V> values() 返回此映射中包含的值的Collection视图。
        Collection<Integer> col=map1.values();
        for (Integer vals:col){
            System.out.println(vals);
        }
        //遍历方法2.     Set<K> keySet()   获取所有的key,根据key获取value
        Set<String> set=map1.keySet();
        //获得一个set集合，使用增强foreach和 Iterator
        Iterator it=set.iterator();//获取一个Iterator对象
        while(it.hasNext()){
            System.out.println(map1.get(it.next()));
        }
    /**遍历方法3. Set<Map.Entry<K,V>> entrySet()
                  K getKey() 返回与此条目对应的键。
                    V getValue()
        */
    Set<Map.Entry<String,Integer>> entries=map1.entrySet();
    //调用map集合的entrySet()方法返回的是Set集合，类型是Map.Entry<String,Integer>
     for (Map.Entry<String,Integer> ent:entries){//使用增强for循环遍历出每一对键值对元素
         System.out.println(ent.getKey()+"----->"+ent.getValue());
     }

    }

}
