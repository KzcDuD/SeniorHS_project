/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20191026;
import java.util.Scanner;
public class Ch2_13 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入第一筆數字");
        String n1 = scan.next();
          int v1 = Integer.parseInt(n1);
        System.out.println("請輸入第二筆數字");
        String n2 = scan.next();
        int v2 = Integer.parseInt(n2);
        
        System.out.printf("%s+%s=%d %n",n1,n2,v1 + v2);
        
    }
    
}
