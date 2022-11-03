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
public class Ch5_3 {

    public static void main(String[] args) {
        Fruit f1 = new Fruit("Banana",50);
        Fruit f2 = new Fruit("Banana",50);
        Fruit f3 = f1; 
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
         System.out.println("=======================");
        System.out.println(f3 == f1);
        System.out.println(f1.equals(f3));//equals預設情況使用==比較
        
        
    }
    
}
