/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20191026;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //封箱
      //1 安全
      //2 規定
      //能封箱的只有基本型態
      //byte Byte
      //short Short
      //int Integer
      //long Long
      //float Float
      //double Double
      //char Character
      //boolean Boolean
      //手動封箱
     Integer v = Integer.valueOf(51);
     //手動解封箱
      int v2 = v.intValue();
      //嘗試封箱一個double封箱
      double price = 2.5;
     Double boxingPrice =  Double.valueOf(price);
     //解封箱
     System.out.println(boxingPrice.doubleValue());
        
        
        
    }
    
}
