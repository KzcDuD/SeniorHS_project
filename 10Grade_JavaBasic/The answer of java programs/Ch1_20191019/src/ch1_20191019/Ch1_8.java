/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20191019;
import java.util.Arrays;
//必考
public class Ch1_8 {
    public static void main(String[] args) {
        //binarySearch 之前一定要排序
        int[] array = {9,7,18,56,34};
        Arrays.sort(array);
        //預設為小到大的遞增排序法
        for(int v : array){
            System.out.print(v+" ");
        }
         System.out.println();
     int index = Arrays.binarySearch(array, 56);
     System.out.println(index);
     //找不到 回傳負數
     //1  比所有都小 回傳-1
        index = Arrays.binarySearch(array, 2);
        System.out.println(index);
     //2  比所有都大 (陣列長度 +1) * -1
       index = Arrays.binarySearch(array, 100);
       System.out.println(index);
     //3  介於之間 找到比被找數大一點的元素位置 * -1
      index = Arrays.binarySearch(array, 20);
      System.out.println(index); 
    index = Arrays.binarySearch(array, 10);
     System.out.println(index); 
    }
    
}
