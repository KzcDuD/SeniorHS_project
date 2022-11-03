package selfstudy.Final_Work;

import java.util.Arrays;
import java.util.Scanner;

//找岀陣列中的資料位置
public class Case_1 {
    /**
 * @param sortedArray
 *            排序好的陣列
 * @param target
 *            尋找的目標值
 * @param start
 *            尋找的開始index，若超出陣列範圍則返回 -1
 * @param end
 *            尋找的結束index，若超出陣列範圍則返回 -1
 * @return 如果找到目標值，返回目標值在陣列的index值，否則返回 -1
 */
    
public static int binarySerch_sort(int[] sortedArray, int  target, int start, int end) {
    if (start < 0 || end >= sortedArray.length) {
        return -1;
    }
    while (start <= end) {
        int mid = (start + end) / 2;
        if (sortedArray[mid] == target) {
            return mid;
        } else if (target > sortedArray[mid]) {
            start = mid + 1;
        } else if (target < sortedArray[mid]) {
            end = mid - 1;
        }
    }
    return -1;
}
    
    
    public static void main(String[] args) {
        //讓使用者輸入陣列長度
        Scanner arr = new Scanner(System.in);
         System.out.println("輸入陣列長度");
        int arr_length =arr.nextInt();
        int[] array = new int[arr_length];
        
        //輸入陣列
     for(int i= 0 ; i< array.length;i++){
         System.out.printf("輸入第%d個數字\n",i+1);
         array[i] = arr.nextInt();
     }
     
     Arrays.sort(array); //由小到大排列
     for(int a:array){
         System.out.print(a+" ");
     }
     
     System.out.println("請輸入想查詢的數字");
     
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        
        int v = binarySerch_sort(array, m,array.length-arr_length,array.length-1); //找出陣列中的位置
        if (v >= 0) {
            System.out.printf(m + "的位置為:%d %n", v);
        }else{
             System.out.println("找不到此數");
        }
        
    }
}
