/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;

import java.util.HashMap;

public class Ch10_5 {

    public static void main(String[] args) {    
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",71);
        map.put("Vivin",93);
        map.put("Lindy",45);
        map.put("Kven",79);
        //後面的function是否會執行
        
//        //Key存在 function是否執行 會執行 且會將回傳值寫入
//        map.compute("Lindy", (k,v)->{
//                System.out.println("Key:"+k);
//                System.out.println("value:"+v);
//            return v+20;
//        });
//        System.out.println(map.get("Lindy"));
//       //Key 存在 不會呼叫 computeIfAbsent
//       map.computeIfAbsent("Lindy", (k)->{
//           System.out.println(" key 存在 computeIfAbsent ");
//           return 100;});
//       //Key 存在 會呼叫 computeIfPresent
//       map.computeIfPresent("Vivin", (k,v)->{
//           System.out.println(" key 存在 computeIfPresent ");
//           return v + 100;});
//      System.out.println(map.get("Vivin")); 


  //Key不存在 function是否執行
  //會執行 且會將回傳值寫入
  //傳入參數value為null
        map.compute("Lucy", (k,v)->{
                System.out.println("Key:"+k);
                System.out.println("value:"+v);
            return v + 20;
        });
     System.out.println(map.get("Lucy"));
//       //Key 不存在 不會呼叫 computeIfAbsent
       map.computeIfAbsent("Ben", (k)->{
           System.out.println(" key 不存在 computeIfAbsent ");
           return 100;});
       System.out.println(map.get("Ben")); 
     //Key 不存在 不會呼叫 computeIfPresent
       map.computeIfPresent("NiNa", (k,v)->{
           System.out.println(" key 不存在 computeIfPresent ");
           return v + 100;});
      System.out.println(map.get("NiNa")); 
//      
      
    }
 
}
