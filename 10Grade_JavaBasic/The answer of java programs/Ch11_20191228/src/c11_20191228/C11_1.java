/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11_20191228;

/**
 *
 * @author xvpow
 */
public class C11_1 {

    
    public static void main(String[] args) {
       
        Test1 t1 = new Test1();
       int v =  t1.testSupplier(()->{return 50;});
       String name =  t1.testSupplier(()->{return "Ken";});  
   
      float number =  t1.<Float>testSupplier(()->15.3f);
      
    }
    
}
