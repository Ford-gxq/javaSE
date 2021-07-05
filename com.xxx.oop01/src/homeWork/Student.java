package homeWork;

public class Student {
        String sNO ;//学号
        String sName;//姓名
        String sSex;//性别
        int sAge;//年龄
        int sJava;//java课程
     //有参构造
        public Student(String sNO, String sName, String sSex, int sAge, int sJava) {
            this.sNO = sNO;
            this.sName = sName;
            this.sSex = sSex;
            this.sAge = sAge;
            this.sJava = sJava;
        }
        public String getsNO() {
            return sNO;
        }
        public String getsName() {
            return sName;
        }
        public String getsSex() {
            return sSex;
        }
        public int getsAge() {
            return sAge;
        }
        public int getsJava() {
            return sJava;
        }
    }
