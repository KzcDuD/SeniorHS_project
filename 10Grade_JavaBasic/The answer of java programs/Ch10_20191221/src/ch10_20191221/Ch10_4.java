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
public class Ch10_4 {
    
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",71);
        map.put("Vivin",93);
        map.put("Lindy",45);
        map.put("Kven",79);
        //merge key 存在 就執行BiFunction 將回傳值 寫入Map
        map.merge("Lindy", 10, (s1,s2)->s1+s2);
       System.out.println(map.get("Lindy")); 
       //merge key 不存在 不執行BiFunction 將新值 寫入Map
       map.merge("Iris", 10, (s1,s2)->s1 +s2);
       System.out.println(map.get("Iris")); 
        
       
    }
    
}
