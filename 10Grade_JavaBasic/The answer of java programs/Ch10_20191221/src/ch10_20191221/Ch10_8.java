/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20191221;
import java.util.TreeMap;
public class Ch10_8 {
    public static void main(String[] args) {
        //用key做排序
        TreeMap<Integer,String>  map = new TreeMap<>();
        map.put(20,"Vivin");
        map.put(10,"Lindy");
        map.put(15,"Iris");
        map.put(7,"Joy");
        map.put(18,"Ken");
        map.forEach((k,v)->System.out.println(k+":"+v));
        

         
    }
    
}
