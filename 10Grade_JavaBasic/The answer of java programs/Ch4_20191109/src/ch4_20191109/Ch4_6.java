/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109;
import java.util.Scanner;
public class Ch4_6 {

   
    static int checkNumber(String inputMsg,String errorMsg){
         Scanner scan = new Scanner(System.in);
          int v1 = 0;
       while(true){
            System.out.println(inputMsg);
            String n1Str = scan.next();
            boolean try1 = false;
            try{
                v1 = Integer.parseInt(n1Str);  
            }catch(NumberFormatException ex){
                try1 = true;
                System.out.println(errorMsg);
            }
            
            if (try1 == false)
             break;
        }
       return v1;
    }

    public static void main(String[] args) {
      
      
        int number1 = checkNumber("請輸入第一筆數字","第一筆數字錯誤");
        int number2 = checkNumber("請輸入第二筆數字","第二筆數字錯誤");
        
    
        System.out.println(number1+number2);
    }
    
}
