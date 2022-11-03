/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116.pkg;
import ch5_20191116.Test1;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Test3 extends Test1 {
     public void publicMethod(){
     
        System.out.println("Test3 publicMethod!!!");
    }
    
    protected void protectedMethod(){
         System.out.println("Test3 protectedMethod!!!");
    }
    //不算複寫
    //幫我檢查是否為正確Override
     void defaultMethod(){
         System.out.println("Test3 defaultMethod!!!");
    }
    
   private void privateMethod(){
        System.out.println("Test3 privareMethod!!!");   
   }
   
    public void testException(){
       System.out.println("Test3 Exception");
   }
}
