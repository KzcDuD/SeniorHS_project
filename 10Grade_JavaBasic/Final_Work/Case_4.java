
package selfstudy.Final_Work;
//排列組合計算

import java.util.Scanner;

public class Case_4 {
    

    static int f(int n) {
        if (n > 0) {
            return (n * f(n - 1));
        } else {
            return 1;
        }
    }
      //計算排列數
    static int P(int n, int k) {
        if (n < k | n == 0 | k == 0) {
            return 1;
        }
        return (f(n) / f(n - k));

    }

    //計算組合數
    static int C(int n, int k) {
        if (n < k | n == 0 | k == 0) {
            return 1;
        }
        return P(n, k) / f(k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("P為排列數");
        System.out.println("p(5,3)=60,為5個元素中取3個的排列數量");
        
        System.out.println("C為組合數,例如:C(5,3)=10");
        System.out.println("C(5,3)=10,為5個元素中取3個的組合數量");
        
        System.out.println("請選擇P OR C");
        String ch = sc.next();
        boolean boo = true;
        do {

        System.out.print("請輸入\n元素:");
            int n = sc.nextInt();
            System.out.print("取");
            int k = sc.nextInt();
            
            
            if (n > 12|| k > 12) {
                System.out.println("數字過大請重新輸入(須<12)"); //避免超過 int 長度
                continue;
            }
            boo =false;
            
            switch (ch) {
            case "c":
            case "C":
                System.out.println(C(n, k));
                break;
            case "p":
            case "P":
                System.out.println(P(n, k));
        }
        } while (boo);  //迴圈直到n,k小於12

        
    }

}
