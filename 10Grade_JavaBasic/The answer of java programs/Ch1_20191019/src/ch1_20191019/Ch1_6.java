/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {
    
    public static void main(String[] args) {
       int[] array1 = new int[3];
       int array2[] = new int[3];
       int[] array3 = {5,6,7,9};
       int[] array4 = new int[]{8,7,6,5,2};       
       //int[] array5 = new int[5]{8,7,6,5,2};
       //array4 = {1,2}
       int index = -1;
       int find = 6;
       // 做完某個動作index 改變為  find 數字在陣列內的index
       //ex:find = 6 index = 2
       for (int i =0; i < array1.length;i++){
           if (array4[i] == find){
               index = i;
               break;
           }
       }
       System.out.println(index);
       
       
       
    }    
}
