/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109.test;
import ch4_20191109.TestModfily;
/**
 *
 * @author shihhaochiu
 */
public class Ch4_4 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //因為在不同Package 所以要import
        //在不同Package 只有public的讀取權限可以直接讀取
        //在不同Package 讀取權限protected可以間接讀取(透過繼承)
       TestModfily mod = new TestModfily();
       System.out.println(mod.publicValue);
       MyTest mytest = new MyTest();
      System.out.println(mytest.getProtectValue()); 
    }
    
}
