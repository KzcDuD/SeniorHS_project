/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20191214;

import java.util.TreeSet;
import java.util.SortedSet;
/**
 *
 * @author xvpow
 */
public class Ch9_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TreeSet<Integer> set = new TreeSet<>();
       //遞增排序(ASC)
       set.add(50);
       set.add(20);
       set.add(5);
       set.add(31);
       set.add(13); 
       
     SortedSet<Integer>  sst = set.subSet(5, 33);
     sst.forEach(System.out::println);
    
    }
    
}
