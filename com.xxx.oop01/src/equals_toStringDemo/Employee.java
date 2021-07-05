package equals_toStringDemo;
/**
 * 自定义员工类, 姓名, 编号, 身高...
 * 要求: 比计较员工是否相等要求比较所有成员属性的值,都想等true, 任何一个不相等返回false
 * */

/**
    员工类
 */
public class Employee {
    private int  id;
    private String name;
    private int height;

    //alt+insert -> constructor ->select none |选中对应要赋值的属性 enter
    //空构造
    public Employee() {
    }
   //有参构造
    public Employee(int id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    /**设置器与访问器*/
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
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
    /**
        比较所有员工的属性值
     */
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Employee){
            Employee emp = (Employee)obj;
            if(this.id==emp.id && this.name.equals(emp.name) && this.height==emp.height){
                return true;
            }
        }
        return false;
    }

   /** @Override   使用快捷键自动生成equals方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                height == employee.height &&
                Objects.equals(name, employee.name);
    } **/

}
