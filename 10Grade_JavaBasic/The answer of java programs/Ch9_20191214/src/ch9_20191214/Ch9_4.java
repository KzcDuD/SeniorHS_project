/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch9_4 {
        static int s =0;
 
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
       list.add(20);
       list.add(70);
       list.add(30);
       int sum = 0;
      for (Integer v : list){
          sum += v;
      } 
      System.out.println(sum);
     
      list.forEach(v->{
          //sum += 2; //放在lambda 語法內的 區域變數 會自動轉為常數
          s  += v;
          System.out.println(v);});            
        System.out.println(s);
    }
   
}
