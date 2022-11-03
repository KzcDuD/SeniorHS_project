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
public class Ch5_4 {

  
    public static void main(String[] args) {
      Fruit f1 = new Fruit("Banana",50);
        Fruit f2 = null;
      System.out.println(f1.equals(f2));
      
        Test1 ts1 = new Test1();
      System.out.println(f1.equals(ts1));
    }
    
}
