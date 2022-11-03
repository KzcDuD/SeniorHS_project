/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116;

import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void publicMethod(){
        System.out.println("Test1 publicMethod!!!");
    }
    
    protected void protectedMethod(){
         System.out.println("Test1 protectedMethod!!!");
    }
    
    void defaultMethod(){
         System.out.println("Test1 defaultMethod!!!");
    }
    
   private void privateMethod(){
    System.out.println("Test1 privareMethod!!!");   
   }
   
   public int testPrimitve(){
       return 50;
   }
   
   public Test1 testRef(){
       return new Test1();
   }
   
   
   public void testOverride(Test1 t1){
       System.out.println("Test1:"+t1);
   }
   
   
    public void testException()throws IOException{
       throw new IOException("Test1 testException");
   }
    
    
    public void testException2() throws IllegalArgumentException{
        System.out.println("Test1 testException2!!!");
    }
}
