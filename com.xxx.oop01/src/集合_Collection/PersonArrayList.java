package 集合_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class PersonArrayList {
    public static void main(String[] args) {

        ArrayList<User>   list=new ArrayList<>();
        list.add(new User(1001,"张三",19,"男"));
        list.add(new User(1002,"李四",22,"女"));
        list.add(new User(1003,"王五",20,"男"));
        list.add(new User(1004,"赵六",25,"男"));
        //遍历集合中的元素
//        获取一个迭代器对象
        ListIterator<User>  it=list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
class User{
    private int id;
    private  String name;
    private int age;
    private String gender;

    public User(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}