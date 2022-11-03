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
public class Ch2_5 {
    public static void main(String[] args) {
       int[][] array = new int[3][];
        array[0] = new int[2];
        array[2] = new int[3];
        
        //array[1][0] = 15;//java.lang.NullPointerException
        //array[2][3] = 71;//ArrayIndexOutOfBoundsException
        array[0][0] = 83;
        
       
        
    }
    
}
