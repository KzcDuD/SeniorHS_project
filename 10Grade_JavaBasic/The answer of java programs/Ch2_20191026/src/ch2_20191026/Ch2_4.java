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
public class Ch2_4 {
    public static void main(String[] args) {
        //考
        int[][] array1 = new int[2][3];//* java建議宣告方式
        int[] array2[] = new int[2][3];
        int array3[][]  = new int[2][3];        
        int[][] array4[] = new int[2][3][2]; 
        int[][] array5 = {{7,2},
                           {8,9} };
         int[][] array3x3= {{-1,-1,-1},
                           {-1,-1,-1},
                           {-1,-1,-1}};      
         //不規則
        int[][] array3xn = new int[3][];
        array3xn[0] =  new int[5];
        array3xn[1] =  new int[2];
        array3xn[2] =  new int[4];
        //java.lang.ArrayIndexOutOfBoundsException
        array3xn[0][3] = 10;
        array3xn[1][0] = 71;
        array3xn[2][2] = 25;
        
        
        for (int[] array : array3xn){
            for (int v : array){
                System.out.printf("%2d ",v);
            }
               System.out.println();
        }
        
        
    }
    
}

