/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",71);
        map.put("Vivin",93);
        map.put("Lindy",45);
        map.put("Kven",79);
        
       System.out.println(map.containsKey("Lindy")); 
       System.out.println(map.containsKey("Iris")); 
       System.out.println(map.containsValue(93)); 
       //getOrDefault java8  特有
       System.out.println(map.getOrDefault("Iris",-1)); 
       
       System.out.println(map.get("Iris")); //回傳null
      // int score = map.get("Iris");//java.lang.NullPointerException
      //如果有重複的Key會取代
       map.put("Vivin", 32);
      System.out.println( map.get("Vivin"));
      //傳統避免Key重複
      if (! map.containsKey("Ken") ){
             map.put("Ken", 0);
      }
       System.out.println( map.get("Ken"));
       //java 8 可使用putIfAbsent
       map.putIfAbsent("Ken", 0);
       System.out.println(map.get("Ken"));
       
       map.replaceAll((k,v)->v+10);
       System.out.println(map);
       
       
       
    }
    
}
