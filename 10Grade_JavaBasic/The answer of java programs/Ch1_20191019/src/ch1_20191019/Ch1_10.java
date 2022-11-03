/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;
import java.util.Arrays;
public class Ch1_10 {
    public static void main(String[] args) {
        int[] arraySrc = {1,2,3,4,5,6,7,8,9};
    int[] arrayCopy =   Arrays.copyOf(arraySrc, 6);
        for (int v : arrayCopy){
            System.out.print(v+" ");
        }
        //所有的陣列都有預設值
         System.out.println();
        //整數 
         int[] array2 = new int[3];
         System.out.println(array2[0]);//0
       //浮點數 
        float[] array3 = new float[3];
        System.out.println(array3[0]);//0.0         
       //字元 
       char[] array4 = new char[3];
       System.out.println(array4[0]);//空白字元
      //布林 
      boolean[] array5 = new boolean[3];
        System.out.println(array5[0]);//false
      //參考型別 
      java.util.Scanner[] array6 = new java.util.Scanner[3];
     System.out.println(array6[0]);//null
        
   int[] array7 = new int[900000];   
   Arrays.fill(array7, -1);
    System.out.println(array7[59]);
    
    String[] array8 = new String[900000];
    Arrays.fill(array8, new String("看不到我!!"));
    System.out.println(array8[26]);
    
   int[] arraySrc2 = {89,97,63,52,12,11};
 int[] arrayCopy2 = 
           Arrays.copyOfRange(arraySrc2, 0, 5);
   for (int v : arrayCopy2){
       System.out.print(v+" ");
   }
   
   //4 5 6
 
    }
    
}
