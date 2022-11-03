/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20191116;
import java.io.IOException;
import ch5_20191116.pkg.Test3;
/**
 *
 * @author xvpow
 */
public class Ch5_1 {

   
    public static void main(String[] args) {
       //簡單複寫範例
       /* Test1 t1 = new Test2();
        t1.publicMethod();*/
        
        //Override 的規則
         //Override: 子類能看到父類的方法才叫做複寫
        //讀取權限只能開放不能封閉
        //回傳值如果是基本型態一定要一樣
        //如果是參考型別 可回傳子類
        //方法名稱與傳入參數必須一樣
        //例外 可拋出子類型或不拋出例外(這限制針對必要例外檢測)
       
        
        
        //最開放 到最不開放
        /*public
          protected
          default(空白)
          private
        */
        
        
       Test1 t2 = new Test2();
       Test1 t3 = new Test3();
       
       t2.testException2();
       
       
            try{
              t2.testException();  
        }catch(IOException ex){
            System.out.println("Ex:"+ex);
        }
        
        try{
            t3.testException();
        }catch(IOException ex){
             System.out.println("Ex:"+ex);
        }
//        
//        System.out.println(t2.testPrimitve());
//        
//        System.out.println(t2.testRef());
//        
//       t2.testOverride(t2);
   
   
    }
    
}
