package 爱心;
/**
 * 爱心的公式 （x²+y²-1）³-x²*y³=0
 * */
public  class LoveHeart {
    public static void main(String[] args) {
        heart();
    }

    public static void heart(){
        for(float y = (float) 1.5;y>-1.5;y -=0.1) {
            for(float x= (float) -1.5;x<1.5;x+= 0.05){
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y)<=0.0) {
                    System.out.print("^");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("情人节快乐！！");
        }
    }
}