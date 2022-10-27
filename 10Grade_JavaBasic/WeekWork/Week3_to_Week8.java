/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfstudy.WeekWork;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class Week3_to_Week8 {

    /**
     * @param args the command line arguments
     */
    
    /* 功能:
     宣告圓周率常數
     讓使用者輸入半徑
     接收使用者的數字
     若1~10之間計算圓周長
     若11~20計算圓面積
     若超過21則計算球體面積
     其中，若圓周長>100，則將半徑加一後，顯示新半徑計算出的周長
     若圓面積>100，則半徑×1.5，顯示新半徑計算的面積
     >200，則半徑×2.4，顯示新半徑計算的球體面積
    */
    
    
    public static void main(String[] args) {
        
        System.out.println("請輸入半徑<r>:");
        Scanner sca = new Scanner(System.in); //輸入半徑
        
        double r = sca.nextDouble(); //接收使用者的數字
        final double pi = 3.1415926; //宣告圓周率常數
        double s = 2 * pi * r; //圓周長
        double a = r * r * pi; //圓面積
        double boll = 0.75 * pi * r * r * r; //球體面積

        if (r <= 10 && r >= 1) {
            System.out.printf("圓周長1 = %.2f %n", s);
        } else if (r >= 11 && r <= 20) {
            System.out.printf("圓面積1 = %.2f %n", a);
        } else if (r > 21) {
            System.out.printf("球體面積1 = %.2f %n", boll);
        }
        
        if (s > 100) {
                r++; //將半徑加一後，顯示新半徑計算出的周長
                System.out.printf("圓周長2 = %.2f %n", 1.5 * s);
            }
        
        if (a > 100) {
                r= r * 1.5;
                a = r * r * pi; //半徑×1.5，顯示新半徑計算的面積
                System.out.printf("圓面積2 = %.2f %n", a);
            }
        
        if (a > 200) {
            r= r * 2.4; //半徑×2.4，顯示新半徑計算的球體面積
                System.out.printf("球體面積2 = %.2f %n",
                         0.75 * pi * r * r * r);
            }
        
    }

}
