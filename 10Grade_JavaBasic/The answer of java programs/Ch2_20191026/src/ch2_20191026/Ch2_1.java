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
public class Ch2_1 {

    public static void main(String[] args) {
        int[][] array = new int[2][3];
        array[0][0] =12;
        array[0][1] = 8;
        array[0][2] = 3;
        array[1][1] = 7;
        array[1][2] = 6;
        
        for (int i = 0  ;  i <array.length ;i++ ){
            for (int k = 0; k < array[i].length;k++){
                System.out.print(array[i][k]+" ");
            }
            System.out.println();
        }
        
    }
    
}
