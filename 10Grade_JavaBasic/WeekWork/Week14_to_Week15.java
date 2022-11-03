/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfstudy.WeekWork;

/*
除最高和最低元素（值）之外，將數組的所有數字相加
示例：

{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6

*/

public class Week14_to_Week15 {
    
     public static int sum(int[] numbers){
    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
    int min,max,sum;
    sum = min = max = numbers[0];
    for (int i = 1; i < numbers.length; i++){
      sum += numbers[i]; 
      if (numbers[i] < min) min = numbers[i];
      if (numbers[i] > max) max = numbers[i];
    }
    return sum - min - max;
  }
       public static void main(String[] args){
           int[] test1 = {1,2,8,6,3,5};
           int[] test2 = {5,8,9,6,1,3,6,5,2};
           System.out.println(sum(test1));
           System.out.println(sum(test2));
           
       }
    
    
    
    
}
