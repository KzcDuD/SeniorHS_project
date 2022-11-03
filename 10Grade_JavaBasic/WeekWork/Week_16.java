/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfstudy.WeekWork;


/*
輸出最長單詞的長度，以數字表示。
只有一個“最長”的詞。
*/

public class Week_16 {
     public static int findLongest(String str) {
    String[] spl = str.split(" ");
     int longest = 0 ;
    for (int i= 0; i< spl.length ;i++) {
      if ( spl[i].length() > longest ) {
          longest = spl[i].length();
          
        }
      }
      return  longest;
     }
     
    public static void main(String[] args) {
        String str ="The quick white fox jumped around the massive dog";
       System.out.println(Week_16.findLongest(str));
}
}