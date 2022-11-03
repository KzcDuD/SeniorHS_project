/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfstudy.WeekWork;
import java.util.Scanner;
/*
輸入一段句子，轉成大寫字母
*/

public class Week_13 {
   
    public static String sum(String s){
       String[] arr = s.split(" ");
       for(int i= 0; i< arr.length; i++){
           arr[i] = arr[i].toUpperCase();
           System.out.print(arr[i]+" ");
       }
        return null;
    }
    
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        String s = sca.next();
        System.out.println(sum(s));
        
        
        
        
    }
    
}
