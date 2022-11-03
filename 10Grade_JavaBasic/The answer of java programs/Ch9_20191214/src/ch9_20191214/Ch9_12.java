/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch9_12 {

    public static void main(String[] args) {
       TreeSet<Integer> set = new TreeSet<>();
       //遞增排序(ASC)
       set.add(50);
       set.add(20);
       set.add(5);
       set.add(31);
       set.add(13); 
       set.forEach(System.out::println);
       
       int min = set.first();
       int last = set.last();
       
       System.out.println(min+":"+last);
       int n = 15;
      int v1 = set.ceiling(n); // ? >=n 
      int v2 = set.higher(n);// ? > n 
      System.out.println(v1+":"+v2);
        n = 50;
       v1 = set.ceiling(n); // ? >=n 
      Integer v3 = set.higher(n);// ? > n 
      System.out.println(v1+":"+v3);  
        
        n = 12;
       v1 = set.floor(n);// ? <= n
       v2 =  set.lower(n); // < n
      System.out.println(v1+":"+v2); 
          n = 5;
         v1 = set.floor(n);// ? <= n
    Integer  v4 =  set.lower(n); // < n
    System.out.println(v1+":"+v4); 
       
      
              
              }
    
}
