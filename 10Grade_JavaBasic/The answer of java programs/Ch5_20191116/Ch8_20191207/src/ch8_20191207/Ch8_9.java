/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20191207;

/**
 *
 * @author xvpow
 */
public class Ch8_9 {
       enum Fruit{
        APPLE,
        KIWI,
        CHARRY
    }
    public static void main(String[] args) {
        // TODO code application logic here
//       Fruit f1=  Fruit.valueOf("KIWI");
//       System.out.println(f1);
//       //Fruit.valueOf("BANANA");
//      Fruit[] fs = Fruit.values();
//      for (Fruit fv :  fs){
//          System.out.println(fv);
//      }
      
     System.out.println(Fruit.APPLE.ordinal()); 
     System.out.println(Fruit.KIWI.ordinal()); 
     //左Ordinal 大於 右邊 回傳正數
     //左Ordinal 小於 右邊 回傳負數
     //左等於右邊回傳0 
     System.out.println(Fruit.CHARRY.compareTo(Fruit.APPLE)); 
    System.out.println( Fruit.CHARRY.name());
     
    }
    
}
