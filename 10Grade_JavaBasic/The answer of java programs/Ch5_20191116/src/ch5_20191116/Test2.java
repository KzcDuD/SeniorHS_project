/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116;
import ch5_20191116.pkg.Test3;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //如果子類能讀到父類的方法 複寫時讀取錯誤 會出現無法編譯(Compiler Error)的情況
    public void publicMethod(){
        System.out.println("Test2 publicMethod!!!");
    }
   
   protected void protectedMethod(){
         System.out.println("Test2 protectedMethod!!!");
    }
   
   void defaultMethod(){
         System.out.println("Test1 defaultMethod!!!");
    }
   //他不是複寫
   // @Override 檢查是否為正確複寫
  private void privateMethod2(){
    System.out.println("Test2 privareMethod!!!");   
   }
     public int testPrimitve(){
       return 79;
   }
     
    public Test3 testRef(){
       return new Test3();
   }
    
   public void testOverride(Test1 t1){
       // public void testOverride(Test2 t1){//overloading
          System.out.println("Test2:"+t1);
   }
   
   
    public void testException()throws FileNotFoundException{
       throw new FileNotFoundException("Test2 testException");
   }
    
    public void testException2() throws NullPointerException{
        System.out.println("Test2 testException2!!!");
    }
}
