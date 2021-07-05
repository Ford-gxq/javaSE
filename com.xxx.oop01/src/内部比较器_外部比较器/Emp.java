package 内部比较器_外部比较器;

import java.util.Objects;

public class Emp  implements Comparable<Emp> {
    private  int sno;//员工编号
    private  String name;
    private   int   tno;

    public Emp(int sno, String name, int tno) {
        this.sno = sno;
        this.name = name;
        this.tno = tno;
    }
    //get和set方法
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return sno == emp.sno &&
                tno == emp.tno &&
                Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, tno);
    }
    //实现ComparaTo方法
    @Override
    public int compareTo(Emp o) {
        return this.sno-o.sno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", tno=" + tno +
                '}';
    }
}
