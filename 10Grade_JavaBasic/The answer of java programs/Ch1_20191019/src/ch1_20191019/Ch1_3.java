/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;
import java.util.Arrays;
public class Ch1_3 {  
    public static void main(String[] args) {
      int[] array1 = new int[3];
      array1[0] =18;
      array1[1] = 25;
      array1[2] = 71;
      
      for (int i= 0;i< array1.length;i++){
          System.out.println(array1[i]);
      }
      //foreach Loop
//      for (int v : array1){
//          System.out.print(v+" ");
//      }
      System.out.println("=================");
      Arrays.stream(array1).forEach(System.out::println);
        
    }
    
}
