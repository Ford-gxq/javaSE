package 注解;

import java.util.ArrayList;
import java.util.List;

/**
    注解:
        作用:
            1) 提供标识作用
            2) 对程序起到一定作用,配置参数等,注解相当于是一种嵌入在程序中的`元数据`
        分类:
            根据注解参数的个数分类
            > 1)、标记注解:一个没有成员定义的Annotation类型被称为标记注解。
            > 2)、单值注解:只有一个值
            > 3)、完整注解:拥有多个值
            根据注解使用方法和用途分类
            > 1)、JDK内置系统注解
                1) @Override 标志一个方法为重写方法
                2) @Deprecated 标记已经过时
                3) @SuppressWarnings 抑制警告
            > 2)、元注解
            > 3)、自定义注解
        使用:
            @注解名(数据)
        位置: 由定义者决定
        注意:
            在未来矿建中,使用组件的时候,代替配置文件的存在
 */
public class Annotation_Demo01 {

    public static void main(String[] args) {

        List list = new ArrayList();
        List list2 = new ArrayList();

    }

    @Deprecated
    public static void test(){

    }

    @Override
    public String toString() {
        return super.toString();
    }


}
