/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch1_9 {

    public static void main(String[] args) {
        // a > A  a > Z
      /* String[] array = {"G","c","B","d","K"};
        Arrays.sort(array);
        for (String v : array){
            System.out.println(v);
        }*/
      
        String[] array2 = {"eFB","FBC","eAk"};
        Arrays.sort(array2);
        for (String v: array2){
            System.out.print(v + " ");
        }
           System.out.println();
       int index = Arrays.binarySearch(array2, "A");
       System.out.println(index);
        index = Arrays.binarySearch(array2, "c"); 
      System.out.println(index);   
         index = Arrays.binarySearch(array2, "g"); 
    System.out.println(index);         
    }
    
}
