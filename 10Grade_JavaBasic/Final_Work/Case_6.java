
package selfstudy.Final_Work;

import java.util.Scanner;

/*矩陣相加 */
public class Case_6 {
    static int m;
    static int n;
    //矩陣相加
    public static int[][] sum(int[][] arr1,int[][] arr2){
        //arr3存放 arr1 + arr2
        int[][] arr3 =new int[m][n];
        
        for(int i=0;i<arr1.length;i++){
            for(int v=0;v<arr1[i].length;v++){
                arr3[i][v] = arr1[i][v]+arr2[i][v];
            }
        }
        
      return arr3;      
   }
    //讓使用者輸入陣列 顯示輸入結果
    public static int[][] input_show_array(int[][] arr,int n){
        Scanner sca =new Scanner(System.in);
        System.out.printf("輸入陣列%d內容\n",n);
        for(int i=0;i<arr.length;i++){
            for(int v=0;v<arr[i].length;v++){
                System.out.printf("輸入第%d排  第%d個: ",i+1,v+1);
                arr[i][v]=sca.nextInt();
            }
        }
        
         System.out.printf("陣列%d內容為:",n);
        for(int column[] : arr){
             System.out.println();
              for(int row : column){
                      System.out.print(" "+row);
              }
         }
         System.out.println();
        
        return arr;
    }
    
    
    public static void main(String[] args){
        Scanner sca =new Scanner(System.in);
        System.out.println("請輸入陣列大小");
        System.out.print("輸入{行}:");
        m =sca.nextInt();
        System.out.print("輸入{列}:");
        n =sca.nextInt();
        
        int[][] arr1 =new int[m][n];
        int[][] arr2 =new int[m][n];
        
        System.out.println();
        
        //讓使用者輸入陣列1 顯示輸入結果
        arr1=input_show_array(arr1,1);
         System.out.println();
        
        //讓使用者輸入陣列2 顯示輸入結果
       arr2=input_show_array(arr2,2);
       System.out.println();

        int[][] new_arr = sum(arr1,arr2);
        
        //印出相加結果
         System.out.print("矩陣相加結果為:");
         for(int column[] : new_arr){
             System.out.println();
              for(int row : column){
                      System.out.print(" "+row);
              }
         }
         System.out.println();
              
    }
    
    
    
    
    
    
    
    
    
    
    
}
