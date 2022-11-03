/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20191109;
import javax.sound.midi.InvalidMidiDataException;
import java.io.IOException;
/**
 *
 * @author shihhaochiu
 */
public class Ch4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //基本例外分兩種
        //1 直接繼承Exception的 除了RuntimeException外都是
        //必要例外檢測的 catch
        //例外嚴重性高 無法檢測的
        //IOException 
        //FileNotFoundException
        //SQLException
        //InterruptedException
        
        //2 繼承樹上有RuntimeException為非必要例外檢測的uncatch
         // 嚴重性不高 可檢查的 
         //ArithmeticException 
         //IndexOutOfBoundsException
         //NullPointerException
        Product p1 = new Product();
        try{
            p1.setId("");//長度小於5拋出IOException
            p1.setPrice(10);
            p1.print();
        }catch(InvalidMidiDataException ex){
          System.out.println(ex);
        }catch(IOException ex){
           System.out.println(ex); 
        }
        
        
        //金額不可小於100大於1000000
        //當發生問題時 顯示錯誤訊息 錯誤的金額
        //
    }
    
}
