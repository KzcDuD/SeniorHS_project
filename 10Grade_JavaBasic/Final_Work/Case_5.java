
package selfstudy.Final_Work;

import java.util.Scanner;

/*陣列反轉*/
public class Case_5 {
     
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        //讓使用者輸入陣列長度
        System.out.println("輸入陣列長度");
        int arr_length =sca.nextInt();
        int[] n = new int[arr_length];
        //輸入陣列
         System.out.println("輸入陣列內容");
     for(int i= 0 ; i< n.length;i++){
         System.out.printf("輸入第%d個數字\n",i+1);
         n[i] = sca.nextInt();
     }
     
        System.out.println("\n");
        
        int[] turn=new int[n.length];
        
        //執行陣列反轉
       for(int i=0;i<n.length;i++){
           turn[i]=n[n.length -1-i];
       }
       
       //印出結果
       System.out.println("陣列反轉後為");
       for(int m =0;m < turn.length;m++){
           System.out.print(turn[m]+" ");
       }
       System.out.println();
       
    }
}
