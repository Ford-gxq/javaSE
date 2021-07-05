package homeWork;
/**
 * 定义一个类 Draw ，包含两个属性：星号的个数（count）行数（lines）
 * 在类中提供 3 个 方法:
 * 输出直角三角形drawTrian()、 输出矩形drawRec()及平行四边形drawPra()
 *
 * **/
public class Draw {
    private int count, lines;//私有变量行数和列数

    //空参构造
    public Draw() {
    }

    //有参构造
    public Draw(int count, int lines) {
        this.count = count;
        this.lines = lines;
    }

    /**
     * 画直角三角形
     */
    public void drawTrian() {
        for (int i = 0; i < lines; i++) { //共lines行
            for (int j = 0; j < i; j++) {//每次增加1
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }

    //画矩形
    public void drawRec() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < count; j++) {//每行数量固定
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //画平行四边形
    public void drawPra(){
        for (int i = 0; i < lines; i++) {
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Draw d = new Draw(5,5);
        System.out.println("------三角形-----");
        d.drawTrian();
        System.out.println("------矩形---------");
        d.drawRec();
        System.out.println("------平行四边形-----");
        d.drawPra();
    }
}
