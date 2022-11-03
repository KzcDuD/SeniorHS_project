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
public class Ch2_9 {

    static void swap(int a,int b){
          int tmp= b;
            b = a;
            a = tmp;
    }
    
    static void swap(int[] array){
            int tmp = array[0];
      array[0] = array[1];
      array[1] = tmp;
    }
    public static void main(String[] args) {
        
        //考試愛考
      //call by value
      int a = 10,b = 20;
      System.out.printf("a:%d b:%d %n",a,b);
         swap(a,b);
      System.out.printf("a:%d b:%d %n",a,b);        
      //call by reference
      int[] array = {31,72};
      System.out.printf("array[0]:%d array[1]:%d %n",
              array[0],array[1]);
      swap(array);
      System.out.printf("array[0]:%d array[1]:%d %n",
              array[0],array[1]);
    }
    
}
