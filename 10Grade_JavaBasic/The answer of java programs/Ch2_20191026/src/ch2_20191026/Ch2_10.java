
package ch2_20191026;


public class Ch2_10 {
    
    static void test1(int[] array,int n){
        for (int i =0;i<array.length ;i++){
            array[i] += n;
        }
    }
    static void foreach(int[] src){
        for (int v : src){
            System.out.print(v+" ");
        }
           System.out.println();
    }
    //寫一個方法 可傳入一個整數陣列與整數n 幫我把每個陣列的內容都加上n
    public static void main(String[] args) {
      
        int[] myArray = {1,2,3,4};
        foreach(myArray);
        test1(myArray,2);
        foreach(myArray);
    }
    
}
