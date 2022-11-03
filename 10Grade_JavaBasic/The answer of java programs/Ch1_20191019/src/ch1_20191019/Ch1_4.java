/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;
import java.util.Scanner;
public class Ch1_4 {

  
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String[] names = new String[2];
       
       for (int i =0;i< names.length;i++){
           System.out.println("Input name:");
           names[i] = scan.next();           
       }
       
       for (String name : names){
           System.out.println(name);
       }


       
    }

    
}
