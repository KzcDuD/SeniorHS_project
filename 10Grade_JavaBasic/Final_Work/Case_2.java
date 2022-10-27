package selfstudy.Final_Work;

//   以速度總時間計算物體移動的加速度、平均速度、位移
import java.util.InputMismatchException;
import java.util.Scanner;

public class Case_2 {
    public static void main(String[] args) throws Exception{
        
        Scanner sca = new Scanner(System.in);

        System.out.println("輸入總時間");
        int t = sca.nextInt();
        System.out.println("輸入初速");
        int Vo = sca.nextInt();
        System.out.println("輸入末速");
        int v = sca.nextInt();

        System.out.println("要取加速度請按1; ");
        System.out.println("要取平均速度請按2;");
        System.out.println("要取位移請按3");
        System.out.println("全部都要請按4");
        
        float a =Vo-v/ t*t;
        float b =Vo-v/ t;
        float s =(Vo*t) + (a*t*t/2) ;

        try {
            int F = sca.nextInt();
            switch (F) {
                case 1:
                    System.out.printf("加速度= %.2fm/s*s \n", a);
                    break;
                case 2:
                    System.out.printf("平均速度= %.2f m/s \n", b);
                    break;
                case 3:
                    System.out.printf("位移= %.2f m \n", s);
                    break;
                case 4:
                    System.out.printf("加速度= %.2f m/s*s, 平均速度= %.2f m/s, 位移= %.2f m \n", a, b, s);
                    break;
                default:
                    System.out.println("輸入應為1到4");
                    break;

            }
        } catch (InputMismatchException im) {
            System.out.println(im + "輸入應為1到4!!");

        }

    }

}
