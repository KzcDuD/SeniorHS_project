/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;

public class Ch1_1 {
    public static void main(String[] args) {
        int a1 = 10;
        float b2 = 2.567f;
        System.out.printf("%d+%f=%.2f%n",a1,b2,a1+b2);
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("請輸入年齡");
         int age =  scan.nextInt();
        if (age >= 0 && age <= 17){
            System.out.println("未成年");
        }else if (age >= 18 && age <=30){
            System.out.println("青年");
        }else if(age >=31 && age <=50){
               System.out.println("青壯年");
        }else if(age >=51 && age <=63){
             System.out.println("壯年"); 
        }else if(age > 63){
              System.out.println("老年"); 
        }else{
              System.out.println("錯誤"); 
        }
        
       for (int i =1;i<=4;i++){           
           for (int k = 1;k<=i;k++){
               System.out.print("*");
           }
           System.out.println();
       }
        
        
    }
    
}
