
package selfstudy.Final_Work;

import java.util.*;
public class Case_9 {
    
    static int s;
    
    public static int Fac(int n,int m){  //取公因數
       
         for(int i=1;i<=n;i++){
             for(int v=1;v<=m;v++){         //把數值一個接一個抓來除n和m
                if(n%i==0 && m%v==0 && v==i){     //確定整除n和m 並確定公因數
                   s=i;                   //如果直接return 結果為1 所以使用 static變數儲存公因數
                }
            
            }
         }
        
       return s;     //回傳static變數 並離開方法
    }
    
    
    
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        
        System.out.println("請輸入兩數,取最大公因數和最小公倍數");
        
        int n=sca.nextInt();
        int m=sca.nextInt();
        int fac=Fac(n,m);
        
        System.out.printf("最大公因數:%d\n最小公倍數:%d\n", fac , n*m/fac);
        
    }
    
}
