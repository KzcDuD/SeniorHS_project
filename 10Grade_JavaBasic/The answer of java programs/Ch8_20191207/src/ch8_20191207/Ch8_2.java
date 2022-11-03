/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;
import  ch8_20191207.Ch8_1.StatcInnerClass2;
import  ch8_20191207.Ch8_1.InnerClass2;
public class Ch8_2 {

    public static void main(String[] args) {
      StatcInnerClass2 c8Class = 
               new StatcInnerClass2(95);
        System.out
                .println(c8Class);
        Ch8_1 ch81 = new Ch8_1();
       Ch8_1.InnerClass2 inn2 = 
               ch81.new  InnerClass2(72,"Ken");
       System.out.println(inn2);
       
         Ch8_1.InnerClass2 inn3 = 
               new Ch8_1().new  InnerClass2(83,"Vivin");
       System.out.println(inn3);
    }
    
}
