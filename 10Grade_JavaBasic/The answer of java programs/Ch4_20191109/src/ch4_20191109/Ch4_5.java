/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109;

/**
 *
 * @author shihhaochiu
 */
public class Ch4_5 {

    
    public static void testFilally(){
        
        try{
            System.out.println("Step 1");
            if (true){
                return;
            }
        }finally{
           System.out.println("Step 2");  
        }
       
    }
    
    public static void main(String[] args) {
        //finally 一定會執行一次
               /*Product p2 = new Product();
               try{
                  System.out.println("Step 1");
                  p2.setName("AA"); 
                 
               }catch(ProductNameNullException ex){
                   System.out.println(ex);
               }catch(ProductNameException ex){
                    System.out.println(ex);
               }finally{
                  System.out.println("Step 2");  
               }*/
               testFilally();
               
        
        
        
    }
    
}
