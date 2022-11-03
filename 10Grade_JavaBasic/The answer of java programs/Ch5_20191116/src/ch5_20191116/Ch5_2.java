/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Fruit f1 = new Fruit("Apple",50);
      System.out.println(f1.getName());
      System.out.println(f1.getPrice());
      //所以java 類別都extends Object
      
       System.out.println(f1);
       //%x 顯示時把10進位轉成16進位
      System.out.printf("%s@%x%n",f1.getClass().getName(),f1.hashCode());
      //參考型別轉字串都會呼叫toString
      
      String value = f1+"";
      System.out.println(value);
    }
    
}
