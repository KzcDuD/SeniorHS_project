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
public class Ch1_5 {

    //宣告一個長度為5的整數陣列
    //找出些是3的倍數 
    //並且相加 之後輸出
    //3+6+9=18
    public static void main(String[] args) {
       int[] array = new int[5];
        array[0] =3;
        array[1] =5;
        array[2] =6;
        array[3] =9;
        array[4] =8;
        int sum = 0;
        int k = 0;
       int[] array2 = new int[array.length];
     for ( int i =0 ; i<array.length ; i++){
            if (array[i] % 3 == 0){
                sum += array[i];
                array2[k++] = array[i] ;
                //System.out.print(array[i]);                    
            }                                   
     }
     
     for (int i = 0; i <array2.length;i++){
         if (array2[i] != 0){
             System.out.print(array2[i]);
         }
         if (i < array2.length -1  && array2[i +1] != 0){
             System.out.print("+");
         }
     }
     System.out.printf("=%d%n",sum);
    }
    
}
