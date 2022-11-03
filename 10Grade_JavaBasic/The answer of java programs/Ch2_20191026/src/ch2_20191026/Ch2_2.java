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
public class Ch2_2 {

   
    public static void main(String[] args) {
      int[][] array = new int[2][3];
        array[0][0] = 71;
        array[0][1] = 83;
        array[0][2] = 94;
        
        array[1][0] = 16;
        array[1][1] = 92;        
        array[1][2] = 85;
        int find = 83;//顯示 83的 R index C index
        Tag1:
        for (int i = 0; i < array.length;i++){
            for(int k = 0; k <array[i].length ;k++){
                if (array[i][k] == find){
                    System.out.printf("R:%d C:%d%n",i,k);
                    break Tag1;
                }
                //System.out.println(array[i][k]);
            }
              System.out.println("=================");
        }
        
    }
    
}

