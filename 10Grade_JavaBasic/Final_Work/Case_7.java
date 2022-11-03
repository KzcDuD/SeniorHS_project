
package selfstudy.Final_Work;

/* 計算正n邊形內角合*/
import java.util.*;

public class Case_7 {

    //計算內角和
    public static int ang(int n) {
        int out = 360 / n;
        int in = 180 - out;
        out = n * in;
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("計算正n邊形內角和");
        System.out.print("請輸入邊長:");
        int n = sc.nextInt();

        if (n < 3) {    //是否可以組成多邊形
            System.out.println("不成立");
        } else {
            //輸出結果
            System.out.println("內角合為"+ang(n));

        }
    }

}
