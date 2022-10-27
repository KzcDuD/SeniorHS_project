/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfstudy.WeekWork;

import java.util.Scanner;
/*
輸入兩數字，選擇加、減、乘、除計算
*/
public class Week9_to_Week12 {

    public static void main(String[] args) {
       
       Scanner sca =new Scanner(System.in); 
       System.out.println("請輸入數字a和b");
       int a = sca.nextInt();
       int b = sca.nextInt();
       System.out.println("請選擇\t+\t-\t*\t/\t%");
       String s = sca.next();
       int c;
      
       switch(s){
           case "+":
               c=a+b;
               System.out.println(a+" + "+b+" = "+c);
               break;
           case "-": 
               c= a-b;
               System.out.println(a+" - "+b+" = "+c);
               break;
           case "*":
               c= a*b;
               System.out.println(a+" * "+b+" = "+c);
               break;
           case "/":
               c=a/b;
               System.out.println(a+" / "+b+" = "+c);
               break;
           case "%":
                c=a%b;
               System.out.println(a+" % "+b+" = "+c);
               break;
           default:
               System.out.println("請選擇\t+\t-\t*\t/\t%");
               break;
       }
   
    }
    
    
}
