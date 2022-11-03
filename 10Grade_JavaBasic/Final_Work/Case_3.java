
package selfstudy.Final_Work;

import java.util.Scanner;

/*判斷質數*/
public class Case_3 {
    
    //判斷質數
    public static int pri(int n) {
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {   //抓出有因數的數
                return 0;
            }
        }
        return n;

    }

    public static void main(String[] args) {

         Scanner sca =new Scanner(System.in);
         
         System.out.print("輸入數字，計算質數:");   
         int n=sca.nextInt();
         
            if (pri(n) == 0 || pri(n) == 1) {  //排除有因數的數和1
                System.out.println("不是質數");              
            }else{
            System.out.println("是質數");  //印出質數
            }
    }
}
