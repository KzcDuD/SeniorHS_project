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
public class Ch2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //自動封箱 自動解封箱     
     Integer ageBox = 25;     
     int unAge = ageBox;
     
     System.out.println(ageBox);
     System.out.println(unAge);
     
     //java 可宣告不同進位的變數
     int b = 0b01010;
     int h =0xFF0011;
     int o =071;
     
     String binary =  Integer.toBinaryString(20);
      System.out.println(binary);
    String hex =   Integer.toHexString(501);
     System.out.println(hex);
   String octal =  Integer.toOctalString(102);
     System.out.println(octal);
     
     //補充一下 互斥
     boolean b1 = true;
     boolean b2 = true;
     System.out.print(b2 ^ b1);//XOR 互斥
     //一真一假 為真
     
    }
    
}
