/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class Ch10_2 {

    public static void main(String[] args) {
        //Hash 系列都沒有一定順序
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",71);
        map.put("Vivin",93);
        map.put("Lindy",45);
        map.put("awieqoiweopqi",45);
        map.put("Kven",79);
        
        
       Integer score =   map.get("Vivin");
       System.out.println(score);
       
//    傳統方案
     Set<Entry<String,Integer>> entrySet = map.entrySet();
       for (Entry<String,Integer> en : entrySet){
           System.out.println(en.getKey()+":"+en.getValue());
           // System.out.println(map.get(en.getKey()));
       }
      map.forEach((k,v)->System.out.println(k+":"+v));
      
    }
    
}
